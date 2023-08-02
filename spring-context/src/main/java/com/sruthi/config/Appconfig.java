package com.sruthi.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sruthi.ass.AadharCard;
import com.sruthi.ass.Citizen;
@Configuration
@ComponentScan(basePackages="com.sruthi.ass")
public class Appconfig 
{
	/*
	@Bean()
	public AadharCard aadhar()
	{
		return new AadharCard(23556,"sruthi","02/11/2001","2t3784358");
	}
	@Bean()
	public Citizen citizen()
	{
		return new Citizen(aadhar(),23);
	}*/
}
