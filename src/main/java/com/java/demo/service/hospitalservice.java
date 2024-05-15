package com.java.demo.service;
import com.java.demo.dao.*;
import com.java.exception.PatientNumberNotFoundException;

import java.util.Scanner;
import com.java.model.*;

public class hospitalservice {
	Scanner sc;
	hospitalDao hdao;
	
	public hospitalservice()
	{
		sc= new Scanner(System.in);
		hdao= new hospitalDao();
	}
	
	
	 public void getAppointmentById()
	 {
		 System.out.println("enter appointment id");
		 int appointmentID = sc.nextInt();
		 hdao.getById(appointmentID);
		
	 }	
	 
	 public void getAppointmentForPatient() throws PatientNumberNotFoundException {
		 int patientID;
		 System.out.println("enter patient id");
		 patientID=sc.nextInt();
		 hdao.getForPatient(patientID);
	 }
	 
	 public void getAppointmentForDoctor() {
		 int DoctorID;
		 System.out.println("enter doctor id");
		 DoctorID=sc.nextInt();
		 hdao.getForDoctor(DoctorID);
	 }
	 
	 public void scheduleAppointment() {
		 Appointment a = new Appointment();
			
		 System.out.println("enter appointment id");
		 a.setAppointment_id(sc.nextInt());
		 System.out.println("enter patient id");
		 a.setPatient_id(sc.nextInt());
		 System.out.println("enter doctor id");
		 a.setDoctor_id(sc.nextInt());
		 sc.nextLine();
		 System.out.println("enter appointment date");
		 a.setAppointmentDate(sc.nextLine());
		 sc.nextLine();
		 System.out.println("enter desciption");
		 a.setDescription(sc.nextLine());
		 hdao.add(a);
	 }
	 
	 public void updateAppointment() {
		 String appointmentDate;
		 int appointmentID;
		 System.out.println("enter apppointment date");
		 appointmentDate=sc.nextLine();
		 sc.nextLine();
		 System.out.println("enter appointment id ");
		 appointmentID=sc.nextInt();
		 hdao.update(appointmentDate, appointmentID);
		 
	 }
	 
	 public void cancelAppointment() {
		 int appointmentID;
		 System.out.println("enter appointment id");
		 appointmentID=sc.nextInt();
		 hdao.remove(appointmentID);
	 }
}
