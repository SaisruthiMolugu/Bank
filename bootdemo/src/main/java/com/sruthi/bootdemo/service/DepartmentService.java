package com.sruthi.bootdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sruthi.bootdemo.entity.Department;
import com.sruthi.bootdemo.repository.DepartmentRepository;

@Service
public class DepartmentService 
{ 
	@Autowired
	DepartmentRepository departmentRepository;
	public Department getDepartmentBydepartmentnumber(int departmentnumber)
	{
		Optional<Department> od = departmentRepository.findById(departmentnumber);
		if(od.isPresent())
			return od.get();
		//return null;
		throw new RuntimeException("Department id is not exist");
	}

}
