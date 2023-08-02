package com.sruthi.ass;
import org.springframework.stereotype.Component;
@Component
public class AadharCard 
{
	private long aadharnumber=62352346;
	private String name="Sruthi";
    private String dob="02/11/2001";
    private String address="4-96,pamukunta,rajapet,ts";
	public AadharCard() {}
	public AadharCard(long aadharnumber, String name, String dob, String address) 
	{
		this.aadharnumber = aadharnumber;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	public long getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
    
    
    
    
}
