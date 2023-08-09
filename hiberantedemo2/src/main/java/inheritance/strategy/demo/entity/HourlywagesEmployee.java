package inheritance.strategy.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
//@DiscriminatorValue("HourlyWages")
public class HourlywagesEmployee extends Employee 
{
	@Column(name="no_hours")
	private int noOfHours;
	
	@Column(name="rate_hour")
	private double ratePerHour;

	public HourlywagesEmployee() {}
	public HourlywagesEmployee(int employeeid,String employeename,int noOfHours, double ratePerHour) 
	{
		super(employeeid,employeename);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	

}
