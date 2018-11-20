package com.cg.ctrl;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class User {

	@NotEmpty(message="first name is mandatory")
	@Size(min=4,max=8,message="Minimum of 4 and Maximum of 8 required")
	private String firstName;
	
	@NotEmpty(message="last name is mandatory")
	@Size(min=4,max=8,message="Minimum of 4 and Maximum of 8 required")
	private String lastName;
	
	private char gender;
	
	@NotEmpty(message="email is mandatory")
	@Email(message="please enter valid mail id")
	private String email;

	private String[] skillSet;
	private String city;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
