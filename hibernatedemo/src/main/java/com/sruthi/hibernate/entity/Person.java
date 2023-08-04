package com.sruthi.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
 @Id
 private int ss;
 @Column(name="name")
 private String Personname;
 @Column(name="age")
 private int Personage;
 private char gender;
 
 @OneToOne
 @JoinColumn(name="address_id")
 Address address;

public Person() {}
public Person(int ss, String personname, int personage, char gender, Address address)
{
	this.ss = ss;
	Personname = personname;
	Personage = personage;
	this.gender = gender;
	this.address = address;
}

public int getSs() {
	return ss;
}

public void setSsn(int ss) {
	this.ss = ss;
}

public String getPersonname() {
	return Personname;
}

public void setPersonname(String personname) {
	Personname = personname;
}

public int getPersonage() {
	return Personage;
}

public void setPersonage(int personage) {
	Personage = personage;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
 
}
