package com.java.model;

public class Patient {
	int Patient_id;
	String firstName;
	String lastName;
	String dateOfBirth;
	String gender;
	int contact;
	String address;
	
	Patient(){
		
	}
	
	public Patient(int patient_id, String firstName, String lastName, String dateOfBirth, String gender, int contact,
			String address) {
		Patient_id = patient_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contact = contact;
		this.address = address;
	}

	public int getPatient_id() {
		return Patient_id;
	}
	@Override
	public String toString() {
		return "Patient [Patient_id=" + Patient_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", contact=" + contact + ", address="
				+ address + "]";
	}
	public void setPatient_id(int patient_id) {
		Patient_id = patient_id;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
