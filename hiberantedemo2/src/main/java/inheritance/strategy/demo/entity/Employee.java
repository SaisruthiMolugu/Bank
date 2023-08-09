package inheritance.strategy.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*@DiscriminatorColumn(name="emp_type") 
 //for first strategy one able in which employee table includes id,name,typesalary/hourly
 salry,noofhours,rate_hour
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) */
/* for second stategy for three tables
 //1.employee(id,name) 2.salaried employee(id,salary) 3.hourlywagesemployee(id,no_hours,rate_hour)
  @Inheritance(strategy=InheritanceType.JOINED)
 */

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//1.salarybased(id,name,salary) 2.hourlybases(id,name,no_hours,rate_hour)
abstract public class Employee //only third stategy of two tables
//public class Employee
{ 
	@Id
	@Column(name="emp_id")
	private int employeeid;
	
	@Column(name="emp_name")
	private String employeename;
	public Employee() {}
	public Employee(int employeeid, String employeename)
	{
		this.employeeid = employeeid;
		this.employeename = employeename;
	}
	public int getEmployeeid() 
	{
		return employeeid;
	}
	public void setEmployeeid(int employeeid) 
	{
		this.employeeid = employeeid;
	}
	public String getEmployeename() 
	{
		return employeename;
	}
	public void setEmployeename(String employeename)
	{
		this.employeename = employeename;
	}

}
