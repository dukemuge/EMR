package com.sample.ehr.models.admin;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity


public class Doctor {

  @GeneratedValue
  @Id
  private Long id;

  
  @NotBlank(message = "Indicate full names of the doctor")

  private String fullname;

  @NotBlank(message = "Indicate phone no of doctor")
  private String phoneno;
  
  @NotBlank(message = "Indicate I.D of the doctor")
  private String nationalid;

  private String department;

  private String speciality;

  private String staffid;

public Doctor(Long id,String fullname,
		 String phoneno,
		 String nationalid, String department, String speciality,
		String staffid) {
	
	this.id = id;
	this.fullname = fullname;
	this.phoneno = phoneno;
	this.nationalid = nationalid;
	this.department = department;
	this.speciality = speciality;
	this.staffid = staffid;
}
public Doctor() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getNationalid() {
	return nationalid;
}

public void setNationalid(String nationalid) {
	this.nationalid = nationalid;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getSpeciality() {
	return speciality;
}

public void setSpeciality(String speciality) {
	this.speciality = speciality;
}

public String getStaffid() {
	return staffid;
}

public void setStaffid(String staffid) {
	this.staffid = staffid;
}

  
  



}