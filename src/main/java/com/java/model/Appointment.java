package com.java.model;

public class Appointment {
	int appointment_id;
	int patient_id;
	int doctor_id;
	String appointmentDate;
	String description;
	
	public Appointment(){
		
	}
	
	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", appointmentDate=" + appointmentDate + ", description=" + description + "]";
	}

	public Appointment(int appointment_id, int patient_id, int doctor_id, String appointmentDate, String description) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}

	public int getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
