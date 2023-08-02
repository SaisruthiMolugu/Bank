package com.sruthi.spcd.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class Wish implements InitializingBean,DisposableBean
{
      private String message;
      public Wish() {
    	  System.out.println("Wish bean/object created");
      }
      public Wish(String message)
      {
    	  this.message = message;
      }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void wishInit()
	{
		System.out.println("Whish bean is intialised");
	}
      public void WishDestroy()
      {
    	  System.out.println("wish bean is about to be destroyed");
      }
    
      public void destroy()
      {
    	  System.out.println("From Dispsable.Bean.destroy");
      }
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

  	  System.out.println("from afterPropertySet method");
	}
	
		
	
}
