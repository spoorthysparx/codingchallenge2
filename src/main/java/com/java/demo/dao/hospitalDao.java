package com.java.demo.dao;
import com.java.model.Appointment;
import com.java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.java.exception.*;

public class hospitalDao {
	private Connection con;
	PreparedStatement stat;
	
	public  hospitalDao()
	{
		con=DBconnect.getConnect();
	}
	
	public void add(Appointment a)
	{
		
		try
		{
	  stat=con.prepareStatement("insert into appointment values(?,?,?,?,?)");
	  stat.setInt(1, a.getAppointment_id());
	  stat.setInt(2, a.getPatient_id());
	  stat.setInt(3, a.getDoctor_id());
	  stat.setString(4, a.getAppointmentDate());
	  stat.setString(5, a.getDescription());
	  stat.executeUpdate();
	  System.out.println("appointment scheduled");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void remove(int appointmentID) {
		try
		{
		stat=con.prepareStatement("delete from appointment where appointment_id=?");
        stat.setInt(1, appointmentID);
        stat.executeUpdate();
        System.out.println("appointment cancelled");
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}
	
	public void update(String appointmentDate , int appointmentid) {
		try {
			stat=con.prepareStatement("update appointment set appointmentdate=? where appointment_id =?");
            
            stat.setString(1,appointmentDate);
            stat.setInt(2,appointmentid);
            stat.executeUpdate();
            System.out.println("Record updated");
		}
		catch(Exception e) {
			System.out.println(e);
		}

		
	}
	
	public void getById(int appointmentID) {
		try
		{
		
		stat=con.prepareStatement("select * from appointment where appointment_id=? ");
		stat.setInt(1,appointmentID);
        ResultSet rs = stat.executeQuery();
        
        while(rs.next())
        {
        	System.out.println("Appointment ID : "+rs.getInt(1));
        	System.out.println("Patient ID : "+rs.getInt(2));
        	System.out.println("Doctor ID : "+rs.getInt(3));
        	System.out.println("Apoointment Date : "+rs.getString(4));
        	System.out.println("Description : "+rs.getString(5));
        	System.out.println("\n");
        }
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
		public void getForPatient(int patientID) throws PatientNumberNotFoundException {
			try
			{
			
			stat=con.prepareStatement("select * from appointment where patient_id=? ");
			stat.setInt(1,patientID);
	        ResultSet rs = stat.executeQuery();
	        boolean found=false;
	        
	        while(rs.next())
	        {
	        	found=true;
	        	System.out.println("Appointment ID : "+rs.getInt(1));
	        	System.out.println("Patient ID : "+rs.getInt(2));
	        	System.out.println("Doctor ID : "+rs.getInt(3));
	        	System.out.println("Apoointment Date : "+rs.getString(4));
	        	System.out.println("Description : "+rs.getString(5));
	        	System.out.println("\n");
	        }
	        if(found==false) {
	        	throw new PatientNumberNotFoundException("appointment not found");
	        }
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
	}
		
		public void getForDoctor(int DoctorID) {
			try
			{
			
			stat=con.prepareStatement("select * from appointment where doctor_id=? ");
			stat.setInt(1,DoctorID);
	        ResultSet rs = stat.executeQuery();
	        
	        while(rs.next())
	        {
	        	System.out.println("Appointment ID : "+rs.getInt(1));
	        	System.out.println("Patient ID : "+rs.getInt(2));
	        	System.out.println("Doctor ID : "+rs.getInt(3));
	        	System.out.println("Apoointment Date : "+rs.getString(4));
	        	System.out.println("Description : "+rs.getString(5));
	        	System.out.println("\n");
	        }
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
	}
}
