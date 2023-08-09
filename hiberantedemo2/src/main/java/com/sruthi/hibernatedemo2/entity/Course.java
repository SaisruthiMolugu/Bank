package com.sruthi.hibernatedemo2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Course {
@Id
@Column(name="course_name")
private String courseName;
@Column(name = "course_dur")
private int courseDuration;

@Column( name= "faculty_name")
private String facultyname;

@Column(name="course_fee")
private double coursefee;

@ManyToMany
@JoinTable(name="student_course_registration",joinColumns= {@JoinColumn(name="course_name")}
                                             ,inverseJoinColumns= {@JoinColumn(name="stud_id")})
List<Student> students;

public Course() {
	super();
}



public double getCoursefee() {
	return coursefee;
}



public void setCoursefee(double coursefee) {
	this.coursefee = coursefee;
}



public Course(String courseName, int courseDuration, String facultyname, double coursefee, List<Student> students) {
	super();
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	this.facultyname = facultyname;
	this.coursefee = coursefee;
	this.students = students;
}



public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseDuration() {
	return courseDuration;
}

public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}

public String getFacultyname() {
	return facultyname;
}

public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}
 
}
