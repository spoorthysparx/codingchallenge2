package com.java.model;

public class Doctor {
	int doctor_id;
	String firstName;
	String lastName;
	String specialization;
	int contact;
	
	Doctor(){
		
	}
	
	
	public Doctor(int doctor_id, String firstName, String lastName, String specialization, int contact) {
		super();
		this.doctor_id = doctor_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialization = specialization;
		this.contact = contact;
	}


	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", specialization=" + specialization + ", contact=" + contact + "]";
	}
	
}
