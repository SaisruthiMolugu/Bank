import java.util.LinkedList;
public class employeelinkedkist {
	public static void main (String[] args)
	{
		LinkedList<Employee> elist = new LinkedList<>();
		elist.add(new Employee(102,"Babu",2000));
		elist.add(new Employee(103,"sai",3000));
		elist.add(new Employee(104,"ajay",7000));
		elist.add(new Employee(107,"charan",1000));
		elist.addFirst(new Employee(108,"tej",1100));
		System.out.println(elist.remove((new Employee(107,"charan",1000))));
		System.out.println(elist.contains((new Employee(104,"ajay",7000))));
		//both the functions uses the equals ,method in employee .java without that method it returns false
		
		for(Employee e:elist)
			System.out.println(e);
	}

}
