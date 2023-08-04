package com.sruthi.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sruthi.hibernate.dao.EmployeeDAO;
import com.sruthi.hibernate.entity.Employee;
import com.sruthi.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = HibernateUtil.buildSessionFactory();
       Session session=factory.openSession();
       /*Employee e1 = new Employee(103,"Charan",1000,30); to insert values
       Employee e2 = new Employee(102,"Babu",2000,20);
       Transaction trans = session.beginTransaction();
       session.save(e1);
       session.save(e2);
       trans.commit();*/ //for inserting values
    /*   Employee e= session.get(Employee.class,102);
          if(e!=null)
    	   System.out.println(e.getEmployeename()+"  "+e.getSalary()+"  "+e.getDeptno());
          else
    	   System.out.println("Employee with id 102 does not exist");
    
       session.close(); */  // search for the data using only primary that is "id"
      /* Transaction trans = session.beginTransaction();
       Employee e= session.get(Employee.class,102);
       if(e!=null)
    	   e.setEmployeename("Bhanu");
       System.out.println("is Session dirty "+session.isDirty());
       trans.commit();
       System.out.println("is Session dirty "+session.isDirty());
       session.close();*/// updating values
     /*  Transaction trans = session.beginTransaction();
       Employee e= new Employee(102,"Babu",2200,20);
       session.update(e);
       trans.commit();
       session.close();  */ // another way of updating
     /*  Transaction trans = session.beginTransaction();
       Employee e= new Employee(102,"Bhanu",20000,20);
       Employee e1= new Employee(106,"Babu",20090,20);
       session.saveOrUpdate(e);//if no data existing using 102 it will be inserted or else 102 data will be updated // in console it shows update bcz already  data with 102 is existing
       session.saveOrUpdate(e1);
       trans.commit();       
       session.close(); */ //insert or update
      /* Transaction trans = session.beginTransaction();
       Employee e = new Employee();
       e.setEmployeeid(106);=
       session.delete(e);
       trans.commit(); */// delete a row  or 
      /* Transaction trans = session.beginTransaction();
       Employee e = session.get(Employee.class,102);
       if(e!=null)
          session.delete(e);
       else
    	   System.out.println("Employee with id 102 does not exist");
       trans.commit(); */ //another way to delete
    
    EmployeeDAO edao = new EmployeeDAO(factory);
  /*  edao.insertEmployee(new Employee(102,"Cherry",20000,20));
    Employee e = edao.getEmployee(101);
    if(e!=null)
    	System.out.println(e.getEmployeename()+"  "+e.getSalary()+"   "+e.getDeptno());
    edao.modifyEmployee(new Employee(103,"Ram Charan",3300,23));
    edao.DeleteEmployee(new Employee(101," ",0,0));*/

   /* edao.insertEmployee(new Employee(104,"ChARAN",20000,20));
    Employee e1 = edao.getEmployee(101);
    if(e1!=null)
    	System.out.println(e1.getEmployeename()+"  "+e1.getSalary()+"   "+e1.getDeptno());   
    
       HibernateUtil.shutdown();*/
    }
}
