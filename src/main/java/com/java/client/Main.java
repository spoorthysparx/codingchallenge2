package com.java.client;
import java.util.*;
import com.java.util.DBconnect;
import com.java.demo.service.*;
import com.java.exception.PatientNumberNotFoundException;

public class Main {
	public static void main(String [] args) throws PatientNumberNotFoundException {
		hospitalservice hser = new hospitalservice();
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. schedule Appointment");
            System.out.println("2. Update appointment");
            System.out.println("3. cancel appointment");
            System.out.println("4. get appointment by id");
            System.out.println("5. get appointment for patient");
            System.out.println("6. get appointment for doctor");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");

            int ch = sc.nextInt();
            if(ch==1) {
            	hser.scheduleAppointment();
            }
            else if(ch==2) {
            	hser.updateAppointment();
            }
            else if(ch==3) {
            	hser.cancelAppointment();
            }
            else if(ch==4) {
            	hser.getAppointmentById();
            }
            else if(ch==5) {
            
				try {
					hser.getAppointmentForPatient();
				} 
				catch (PatientNumberNotFoundException e) {
					System.out.println(e.getMessage());
				}
            }
            else if(ch==6) {
            	hser.getAppointmentForDoctor();
            }
            else {
            	break;
            }
        }

		sc.close();
	}
}
