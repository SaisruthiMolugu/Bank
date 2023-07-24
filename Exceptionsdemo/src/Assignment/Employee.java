package Assignment;

class Employee {
	private String name;
	private  int empid;
	private int age;
	public Employee() {}
	public Employee(String name,int empid,int age) {
		this.empid = empid;
	this.age = Valid(age);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getAge() {
		return  Valid(age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	private  int Valid(int age)
	{
		if(age>18)
			return age;
		else
			throw new InvalidAgeException("Invalid Age for job ");
	}

	
	

}
