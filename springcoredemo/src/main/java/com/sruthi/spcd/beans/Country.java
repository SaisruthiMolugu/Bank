package com.sruthi.spcd.beans;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Country
{
	private String countryname;
	private String currencyName;
	//private List<String> states;
	//private Set<String> states;
	private Map<String,String> states;
	public Country() {}
	public Country(String countryname, String currencyName, Map<String,String> states) 
	{
		this.countryname = countryname;
		this.currencyName = currencyName;
		this.states = states;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	//public List<String> getStates()
	//public Set<String> getStates(){
	public Map<String,String> getStates(){
		return states;
	}
	//public void setStates(List<String> states) 
	//public void setStates(Set<String> states) {
	public void setStates(Map<String,String> states) {
		this.states = states;
	}

}
