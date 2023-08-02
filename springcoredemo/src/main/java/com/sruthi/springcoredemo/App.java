package com.sruthi.springcoredemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sruthi.spcd.beans.Person;
import com.sruthi.spcd.config.Appconfig;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
    	//AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Appconfig.class);
    	Person p = container.getBean(Person.class);
        System.out.println("SSN ID :-"+p.getSsn()+"     Name:-"+p.getName()+"   Age:-"+p.getAge());
        System.out.println(p.getAddress().getHno()+"     "+p.getAddress().getStreetname()+"    "+p.getAddress().getCity()+"          "+p.getAddress().getState());
    	container.close();
	
    }
}
