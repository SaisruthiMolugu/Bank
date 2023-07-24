import java.util.Comparator;
public class Employeesalarycomparartor implements Comparator<Employee> 

{
	public int compare(Employee e1,Employee e2)
	{
		//return Double.valueOf(e1.getSalary()).compareTo(e2.getSalary());
		return (int) (e1.getSalary()-e2.getSalary());
		}

}
