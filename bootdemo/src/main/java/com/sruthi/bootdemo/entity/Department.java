package com.sruthi.bootdemo.entity;

import java.util.List;

import jakarta.persistence.FetchType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Department
{
	@Id
	@Column(name="deptno")
   private int departmentnumber;
   @Column(name="depyname")
   private String departmentname;
   private String location;
   
   @OneToMany(fetch = jakarta.persistence.FetchType.EAGER)
   @JoinColumn(name="deptno")
   List<Employee> employees;
public Department() {}
public Department(int departmentnumber, String departmentname, String location) {
	super();
	this.departmentnumber = departmentnumber;
	this.departmentname = departmentname;
	this.location = location;
}
public int getDepartmentnumber() {
	return departmentnumber;
}
public void setDepartmentnumber(int departmentnumber) {
	this.departmentnumber = departmentnumber;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

}