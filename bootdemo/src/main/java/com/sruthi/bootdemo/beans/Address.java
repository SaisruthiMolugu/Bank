package com.sruthi.bootdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Address 
{
   private String hno="1-2-1";
   private String Streetname="T street";
   private String City="Hyderabad";
   private String State="Telangana";
   
public Address() {}
public Address(String hno, String streetname, String city, String state)
{
	this.hno = hno;
	Streetname = streetname;
	City = city;
	State = state;
}
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
public String getStreetname() {
	return Streetname;
}
public void setStreetname(String streetname) {
	Streetname = streetname;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
   
}
