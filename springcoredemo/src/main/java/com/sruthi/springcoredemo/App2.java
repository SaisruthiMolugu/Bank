package com.sruthi.springcoredemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sruthi.spcd.beans.Wish;

public class App2 {
	 public static void main( String[] args )
	    {
	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
	Wish w1 = container.getBean("wish1",Wish.class);
	System.out.println(w1.getMessage());
	container.close();
	Wish w2 = container.getBean("wish1",Wish.class);
	w2.setMessage("Spring welcomes you");
	System.out.println(w1.getMessage());
	System.out.println(w2.getMessage());
	    }
}
/*   for singleton and prototype                                        
ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

Wish w1 = container.getBean("wish1",Wish.class);
System.out.println(w1.getMessage());
Wish w2 = container.getBean("wish1",Wish.class);
w2.setMessage("Spring welcomes you");
System.out.println(w1.getMessage());
System.out.println(w2.getMessage());
container.close();
---------------------------
for singleton 
Wish bean/object created
Whish bean is intialised
Good Morning 
Spring welcomes you
Spring welcomes you
wish bean is about to be destroyed
----------------------------------


* for prototype output
Wish bean/object created
Whish bean is intialised
Good Morning 
Wish bean/object created
Whish bean is intialised
Good Morning 
Spring welcomes you

xml code for singleton

<bean id ="wish1"  class ="com.sruthi.spcd.beans.Wish" destroy-method = "WishDestroy" init-method = "wishInit"    >
<property name ="message" value = "Good Morning " />           
</bean>
--------------------------------------
xml code for prototype

<bean id ="wish1"  class ="com.sruthi.spcd.beans.Wish" destroy-method = "WishDestroy" init-method = "wishInit"    scope ="prototype">
<property name ="message" value = "Good Morning " />           
</bean>
*/