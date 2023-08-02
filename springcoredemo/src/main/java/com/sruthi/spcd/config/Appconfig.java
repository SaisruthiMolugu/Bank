package com.sruthi.spcd.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sruthi.spcd.beans.Address;
import com.sruthi.spcd.beans.Person;
@Configuration
@ComponentScan(basePackages="com.sruthi.spcd.beans")
public class Appconfig 
{/*
  @Bean
  public Address address()
  {
	  return new Address("7-8-6","AMBEDKAR NAGAR","Hyderabad","Telangana");
  }
  @Bean(initMethod = "initPerson",destroyMethod = "destPerson")
  public Person person()
  {
	//  return new Person(456,"Ajay",34,address());
	  Person p= new Person();
	  p.setSsn(101);
	  p.setName("ajay");
	  p.setAge(23);
	  return p;
  }*/
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      