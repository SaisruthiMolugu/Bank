package com.sruthi.hibernate.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee 
{
    @Id
    @Column(name="empid")
     private int employeeid;
    @Column(name="empid")
     private String employeename;
	//here we didnt use @column bcz property name and column in db is same
     private double salary;
	
     private int  deptno;
     
	public Employee() {}
	public Employee(int employeeid, String employeename, double salary, int deptno) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
		this.deptno = deptno;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}