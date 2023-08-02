package com.sruthi.springcoredemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sruthi.spcd.beans.Country;
import java.util.Map.Entry;
public class App3 
{
	public static void main(String[] args)
	{
	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
	Country c= container.getBean("ctry",Country.class);
	System.out.println("Country name: " +c.getCountryname());
	System.out.println("Curremcu name : "+c.getCurrencyName());
	System.out.println("States :-");
	//for(String s:c.getStates())
	//System.out.println(s);
	for(Entry<String,String>e:c.getStates().entrySet())
		System.out.println(e.getKey()+"      "+e.getValue());
	container.close();
	}
}
