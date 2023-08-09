package com.sruthi.bootdemo;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.sruthi.bootdemo.beans.Person;
import com.sruthi.bootdemo.entity.Book;
import com.sruthi.bootdemo.entity.Department;
import com.sruthi.bootdemo.entity.Employee;
import com.sruthi.bootdemo.repository.BookRepository;
import com.sruthi.bootdemo.repository.DepartmentRepository;
import com.sruthi.bootdemo.service.DepartmentService;

@SpringBootApplication  //it is a combination of @Configuration,@enableautoconfiuration,@Conponetscan in spring framework
public class Departmentboot 
{
	
	
		public static void main(String[] args)
		{
			ConfigurableApplicationContext container =SpringApplication.run(BootdemoApplication.class, args);
		/*	DepartmentRepository dr = container.getBean(DepartmentRepository.class);
			Optional<Department> d = dr.findById(20);
			if(d.isPresent())
			{
				Department d1=d.get();
			
				System.out.println(d1.getDepartmentnumber()+"   "+d1.getDepartmentname()+"    "+d1.getLocation());
			     for(Employee e: d1.getEmployees())
			    		System.out.println(e.getEmployeeId()+"  "+e.getEmployeeName()+"   "+e.getSalary()); 
		}*/
			    DepartmentService ds = container.getBean(DepartmentService.class);
			    Department d1 = ds.getDepartmentBydepartmentnumber(20);
			    System.out.println(d1.getDepartmentnumber()+"   "+d1.getDepartmentname()+"    "+d1.getLocation());
			     for(Employee e: d1.getEmployees())
			    		System.out.println(e.getEmployeeId()+"  "+e.getEmployeeName()+"   "+e.getSalary()); 
			    
			
		}
		
}