package com.sruthi.hibernatedemo2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student
{
   @Id
   @Column(name="stud_id")
   private int StudentId;
   @Column(name="stud_name")
   private String Studentname;
   @Column(name="stud_mobile")
   private long mobileno;
   
   @Column(name="stu_add")
   private String studentAddress;
   
   @ManyToMany(mappedBy ="students")
   private List<Course> courses;

public Student() {}

public Student(int studentId, String studentname, long mobileno, String studentAddress, List<Course> courses) 
{

	StudentId = studentId;
	Studentname = studentname;
	this.mobileno = mobileno;
	this.studentAddress = studentAddress;
	this.courses = courses;
}

public int getStudentId() {
	return StudentId;
}

public void setStudentId(int studentId) {
	StudentId = studentId;
}

public String getStudentname() {
	return Studentname;
}

public void setStudentname(String studentname) {
	Studentname = studentname;
}

public long getMobileno() {
	return mobileno;
}

public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}

public String getStudentAddress() {
	return studentAddress;
}

public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}

public List<Course> getCourses() {
	return courses;
}

public void setCourses(List<Course> courses) {
	this.courses = courses;
}
   
}
