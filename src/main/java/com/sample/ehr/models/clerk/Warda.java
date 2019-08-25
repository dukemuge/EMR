package com.sample.ehr.models.clerk;

import java.util.*;
import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity


public class Warda {

  @GeneratedValue
  @Id
  private Long id;

  @NotNull(message = " date required")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate doa;

  private String name;
  private String room;


  private String gender;
  private String phoneno;



  private String reason;
  @NotNull(message = " date required")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

  

  private LocalDate dod;
  
  public Warda() {}

public Warda(Long id, LocalDate doa, String name, String room, String gender, String phoneno, String reason, LocalDate dod) {
	
	this.id = id;
	this.doa = doa;
	this.name = name;
	this.room = room;
	this.gender = gender;
	this.phoneno = phoneno;
	this.reason = reason;
	this.dod = dod;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public LocalDate getDoa() {
	return doa;
}

public void setDoa(LocalDate doa) {
	this.doa = doa;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRoom() {
	return room;
}

public void setRoom(String room) {
	this.room = room;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

public LocalDate getDod() {
	return dod;
}

public void setDod(LocalDate dod) {
	this.dod = dod;
}

@Override
public String toString() {
	return "Warda [id=" + id + ", doa=" + doa + ", name=" + name + ", room=" + room + ", gender=" + gender
			+ ", phoneno=" + phoneno + ", reason=" + reason + ", dod=" + dod + "]";
}


  

}
