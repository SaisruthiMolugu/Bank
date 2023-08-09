package com.sruthi.hiberantedemo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sruthi.hiberantedemo2.util.HibernateUtil;
import com.sruthi.hibernatedemo2.entity.Course;
import com.sruthi.hibernatedemo2.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
     SessionFactory factory = HibernateUtil.buildSessionFactory();
     Session session = factory.openSession();
     Course c = session.get(Course.class,"Core Java");
     if(c!=null)
     {
    	 System.out.println(c.getCourseName()+"  "+c.getCourseDuration()+"  "+c.getFacultyname());
    	 for(Student s:c.getStudents())
    		 System.out.println(s.getStudentname()+"  "+s.getMobileno()+"    "+s.getStudentId()+"  "+s.getStudentAddress());
     }
     System.out.println("------------------");
     Student s =session.get(Student.class,8002);
     if(s!=null)
    	 {
    	 System.out.println(s.getStudentId()+"    "+s.getMobileno()+"  "+s.getStudentname());
    	 for(Course c1:s.getCourses())
    	 {
    		 System.out.println(c1.getCourseName()+"  "+c1.getCourseDuration()+"   "+c1.getFacultyname()+"  "+c1.getCoursefee());
    		
    	 }
    	 }
    	 }
}
