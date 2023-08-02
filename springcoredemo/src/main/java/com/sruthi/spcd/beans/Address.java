package com.sruthi.spcd.beans;
import org.springframework.stereotype.Component;
@Component //indicates that this is a bean class whose xml configuration is not required
public class Address 
{
	private String hno="1-2-345";
	private String streetname="Gandhi nagar";
	private String city="YGT";
	private String state="TS";
	public Address() {}
	public Address(String hno, String streetname, String city, String state) 
	{
		this.hno = hno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
	}
	public String getHno() 
	{
		return hno;
	}
	public void setHno(String hno)
	{
		this.hno = hno;
	}
	public String getStreetname() 
	{
		return streetname;
	}
	public void setStreetname(String streetname)
	{
		this.streetname = streetname;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	

}
