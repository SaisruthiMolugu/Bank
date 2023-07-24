package Assignment;
public class Company {
	private String company_name;
	private String location;
	Department[] Departments;
	public Company() {}
	public Company(String company_name, String location,Department[] Departments) {
		this.company_name = company_name;
		this.location = location;
		this.Departments = Departments;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department[] getDepartments() {
		return Departments;
	}
	public void setDepartments(Department[] departments) {
		Departments = departments;
	}
	

}
