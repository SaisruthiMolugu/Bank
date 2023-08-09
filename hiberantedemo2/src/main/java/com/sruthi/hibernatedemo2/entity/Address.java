package com.sruthi.hibernatedemo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
@NamedQuery(name="getAllAddress",query="from Address")
public class Address 
{
	@Id 
	@Column(name="address_id")
	private int addressId;
	@Column(name="hno")
	private String houseno;
	@Column(name="street")
	private String streetName;
	@Column(name="city")
	private String cityName;
	@Column(name="state")
	private String Statename;
	public Address() {}
	public Address(int addresssId, String houseno, String streetName, String cityName, String statename) {
		super();
		this.addressId = addressId;
		this.houseno = houseno;
		this.streetName = streetName;
		this.cityName = cityName;
		Statename = statename;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStatename() {
		return Statename;
	}
	public void setStatename(String statename) {
		Statename = statename;
	}
	
	

}
