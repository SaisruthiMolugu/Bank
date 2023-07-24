class Employee implements Comparable<Employee>{
   private int empid;
   private String ename;
   private double salary;
public Employee() {
}
public Employee(int empid, String ename, double salary) {
	this.empid = empid;
	this.ename = ename;
	this.salary = salary;
}

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString()
{
	return empid+"  "+ename+"   "+salary;
}
@Override
public boolean equals(Object obj) //Arraylist uses
                                   //hashset uses when elements has same hashcode value we use equals
{
	if(obj instanceof Employee)
	{
	//System.out.println("h");
		Employee e=(Employee)obj;
		return empid==e.empid && ename.equals(e.ename) && salary== e.salary;
	}
	return false;
}
	public int hashCode() //hashset uses
    {
		//System.out.println("g");
        return Integer.valueOf(empid).hashCode()+ename.hashCode()+Double.valueOf(salary).hashCode();
         
    }
	public int compareTo(Employee e)  //treeset to compare the elements when added, same reflects to all functions
	{
		//System.out.println("c");
	   return	hashCode() -e.hashCode();
	}
	
}

