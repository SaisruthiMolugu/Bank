package com.sruthi.ass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Citizen 
{
   
   
    private int age=20;
    @Autowired
    private AadharCard aadhar;
    
	public Citizen() {}

	public Citizen(AadharCard aadhar, int age) {
		this.aadhar = aadhar;
		this.age = age;
	}

	public AadharCard getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}
