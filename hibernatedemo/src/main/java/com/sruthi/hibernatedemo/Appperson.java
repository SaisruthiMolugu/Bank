package com.sruthi.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sruthi.hibernate.entity.Address;
import com.sruthi.hibernate.entity.Person;
import com.sruthi.hibernate.util.HibernateUtil;

public class Appperson{

    public static void main( String[] args )

    {

      SessionFactory factory = HibernateUtil.buildSessionFactory();

      Session session = factory.openSession();

      Person p = session.get(Person.class,787);

      if(p!=null)

      {

          System.out.println(p.getSs()+" "+p.getPersonname()+" "+p.getPersonage()+" "+p.getGender());

          System.out.println(p.getAddress().getAddressId()+"  "+p.getAddress().getHouseno()+" "+p.getAddress().getStreetName() );

          System.out.println(p.getAddress().getCityName()+"  "+p.getAddress().getStatename());

      }
    Address a= session.get(Address.class,7001);
    if(a!=null)
    {
    	System.out.println(a.getAddressId()+"  "+a.getStreetName());
    	System.out.println(a.getCityName()+"  "+a.getStatename());
    	System.out.println(a.getPerson().getSs()+" "+a.getPerson().getPersonname());
    	System.out.println(a.getPerson().getPersonage()+"  "+a.getPerson().getGender());
    }
      session.close();

      HibernateUtil.shutdown();

    }

}

