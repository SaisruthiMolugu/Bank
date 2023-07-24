import java.util.HashSet;

import java.util.Iterator;
public class Employeehashset{
	public static void main (String[] args)
	{
		HashSet<Employee> eset = new HashSet<>();
		eset .add(new Employee(102,"babu",2000));
		eset .add(new Employee(103,"sai",3000));
		eset .add(new Employee(104,"Ajay",7000));
		eset .add(new Employee(107,"charan",1000));
		System.out.println(eset .add(new Employee(107,"chiru",1000)));
		
		for(Employee e:eset )
			System.out.println(e);
		Iterator<Employee>  itr = eset.iterator();
		  while(itr.hasNext())
			  System.out.println(itr.next());
	}

}
/*
HashSet<Employee> eset = new HashSet<>();
eset .add(new Employee(102,"Babu",2000));
eset .add(new Employee(103,"sai",3000));
eset .add(new Employee(104,"ajay",7000));
eset .add(new Employee(107,"charan",1000));
System.out.println(eset .add(new Employee(104,"ajay",7000)));
//	System.out.println(eset .remove((new Employee(107,"charan",1000))));
//	System.out.println(eset .contains((new Employee(104,"ajay",7000))));
//both the functions uses the equals ,method in employee .java without that method it returns false

for(Employee e:eset )
	System.out.println(e);

Iterator<Employee>  itr = eset.iterator();
  while(itr.hasNext())
	  System.out.println(itr.next());
	  */
/*
String s1 = new String("Welcome");
String s2 = new String("Welcome");
System.out.println(s1.hashCode()+  "       "+s2.hashCode());
System.out.println(s1.equals(s2));

Double d1 =10.45;
Double d2 = 10.46;
System.out.println(d1.equals(d2));
System.out.println(d1.hashCode()+  "       "+d2.hashCode());
public static void main (String[] args)
	{
		Employee e1 = new Employee(102,"babu",2000);
		Employee e2 = new Employee(102,"babu",2000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()+  "       "+e2.hashCode());
		
		
	}
*/



