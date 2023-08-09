package com.sruthi.bootdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Department
{
   private int deptno=10;
   private String deptname ="Finance";
   private String location ="Mumbai";
public Department() {}
public Department(int deptno, String deptname, String location)
{
	super();
	this.deptno = deptno;
	this.deptname = deptname;
	this.location = location;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
   
}
