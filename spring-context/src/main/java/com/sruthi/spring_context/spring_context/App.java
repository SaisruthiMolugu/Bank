package com.sruthi.spring_context.spring_context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sruthi.ass.Citizen;
import com.sruthi.config.Appconfig;


public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext container = new  ClassPathXmlApplicationContext("beans.xml");
    	//AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Appconfig.class);
    	Citizen c = container.getBean("citi1",Citizen.class);
      System.out.println("age:"+c.getAge());
      System.out.println("aadharnumber:"+c.getAadhar().getAadharnumber()+"   name:  "+c.getAadhar().getName()+"   date of birth:-"+c.getAadhar().getDob());
    		  System.out.println("Address :-"+c.getAadhar().getAddress());
     container.close();
    }
}
