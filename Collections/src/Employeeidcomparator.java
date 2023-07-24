import java.util.Comparator;
public  class Employeeidcomparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getEmpid()-e2.getEmpid();
	}

}
