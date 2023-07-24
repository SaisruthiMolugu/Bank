import java.util.TreeSet;

import java.util.Iterator;

public class Treest {

	public static void main(String[] args) {
		TreeSet<Integer> set =new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(2);
		set.add(27);
		set.add(200);
		set.add(99);
		System.out.println(set.add(99));

		for(Integer i:set)
			System.out.println(i);
		Iterator<Integer> itr =set.iterator();
				while(itr.hasNext())
					System.out.print(itr.next()+" "); 
			System.out.println();
		TreeSet<Employee> eset =new TreeSet<>(new Employeesalarycomparartor());
		//TreeSet<Employee> eset =new TreeSet<>(new EmployeenameComparator());
	//	TreeSet<Employee> eset =new TreeSet<>(new Employeeidcomparator());
	//	Employee e1 = new Employee(101,"Ajay",1000);
		eset .add(new Employee(101,"ajay",10000));
		eset .add(new Employee(104,"charan",3000));
		eset .add(new Employee(102,"babu",2000));
		eset .add(new Employee(103,"sai",1000));
		for(Employee i:eset)
		System.out.println(i);
	  //   System.out.println(eset.comparator());
				
	}

}
