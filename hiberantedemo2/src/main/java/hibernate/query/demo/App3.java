package hibernate.query.demo;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;

import com.sruthi.hiberantedemo2.util.HibernateUtil;
import com.sruthi.hibernatedemo2.entity.Address;

public class App3 
{
	public static void main(String[] args)
      {
		 SessionFactory factory = HibernateUtil.buildSessionFactory();
	   	  Session session = factory.openSession();
	   	  Criteria crt = session.createCriteria(Address.class);
		   crt.addOrder(Order.desc("addressId"));
		  // crt.addOrder(Order.asc("addressId"));
		   List<Address>list = crt.list();
		   for(Address a:list)
		   {
		   System.out.println(a.getAddressId()+"  "+a.getHouseno()+"  "+a.getStreetName()+"  "+a.getCityName()+"  "+a.getStatename());
		   }
	   			 session.close();
	   	  HibernateUtil.shutdown();
		
		/*
		 SessionFactory factory = HibernateUtil.buildSessionFactory();
	   	  Session session = factory.openSession();
	   	  Query<Address> qry = session.createNamedQuery("getAllAddress",Address.class);
	   	
	   	   List<Address> alist = qry.getResultList();
	   	   for(Address a :alist)
	   	   {
	   		   System.out.println(a.getAddressId()+"   "+a.getHouseno()+"  "+a.getStreetName()+"  "+a.getCityName()+"  "+a.getStatename());
	   	   }
	   	 
	   	  session.close();
	   	  HibernateUtil.shutdown();
		 */
		/* SessionFactory factory = HibernateUtil.buildSessionFactory();
   	  Session session = factory.openSession();
   	  Query<Address> qry = session.createQuery("SELECT a from Address a where  a.addressId=?1",Address.class);
   	  qry.setInteger(1,7002);
   	   List<Address> alist = qry.getResultList();
   	   for(Address a :alist)
   	   {
   		   System.out.println(a.getAddressId()+"   "+a.getHouseno()+"  "+a.getStreetName()+"  "+a.getCityName()+"  "+a.getStatename());
   	   }
   	 
   	  session.close();
   	  HibernateUtil.shutdown();*/

		/* SessionFactory factory = HibernateUtil.buildSessionFactory();
    	  Session session = factory.openSession();
    	  Query<Address> qry = session.createQuery("from Address",Address.class);
    	  //Query<Address> qry = session.createQuery("SELECT A from Address A",Address.class);
    	   List<Address> alist = qry.getResultList();
    	   for(Address a :alist)
    	   {
    		   System.out.println(a.getAddressId()+"   "+a.getHouseno()+"  "+a.getStreetName()+"  "+a.getCityName()+"  "+a.getStatename());
    	   }
    	 
    	  session.close();
    	  HibernateUtil.shutdown(); */
    		  //for creating query
    	  /* SessionFactory factory = HibernateUtil.buildSessionFactory();
    	  Session session = factory.openSession();
    	  Query qry = session.createSQLQuery("select * from address");
    	  List<Object[]> list =qry.list();
    	  for(Object[] obj:list)
    	  {
    		  for(Object o:obj)
    			  System.out.print(o+"  ");
    		  System.out.println();
    	  }
    	  System.out.println(list);
    	  session.close();
    	  HibernateUtil.shutdown(); */
 }
}
