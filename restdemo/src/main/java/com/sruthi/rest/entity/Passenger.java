package com.sruthi.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger
{
	@Id
  @Column(name="pass_id")
  private int passengerid;
  @Column(name="pass_name")
  private String passengername;
  @Column(name="pass_mobile")
  private long mobileno;
  @Column(name="pass_age")
  private int age;
  @Column(name="train_id")
  private int trainId;
  transient private Train train;
public Passenger() {}
public Passenger(int passengerid, String passengername, long mobileno, int age, int trainId)
{

	this.passengerid = passengerid;
	this.passengername = passengername;
	this.mobileno = mobileno;
	this.age = age;
	this.trainId = trainId;
}
public int getPassengerid() {
	return passengerid;
}
public void setPassengerid(int passengerid) {
	this.passengerid = passengerid;
}
public String getPassengername() {
	return passengername;
}
public void setPassengername(String passengername) {
	this.passengername = passengername;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getTrainId() {
	return trainId;
}
public void setTrainId(int trainId) {
	this.trainId = trainId;
}
public Train getTrain() {
	return train;
}
public void setTrain(Train train) {
	this.train = train;
}
  
}
