package sruthi;


class ChildThread  implements Runnable
{
	Thread t;
	public ChildThread(String name)                                              //public ChildThread() 
	{
	    t= new Thread(this,name);
		t.start();
	}
	public  void run()
	{
		try {
		      for(int i=1;i<=10;i++)
		      {
			  System.out.println(t.getName()+"  "+i);
		    	t.sleep(1000);
		      }
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(t.getName()+"is terminating");
	}
}
public class Mutliplethreads {

	public static void main(String[] args) throws Exception {
		ChildThread ct1 = new ChildThread("Fisrt Child");
		ChildThread ct2= new ChildThread("Second Child");
		//for(int i=1;i<=10;i++)
		//	System.out.println("Main loop "+i);
		ct1.t.join()        ;//until the child thread dies and joins the parent ,the parent thread waits do nothing
		ct2.t.join();
		//System.out.println("Main is Terminating");
	}

}
/*
Another method
class SecondThread implements Runnable
{
	public  void run()
	{
		for(int i=1;i<=100;i++)
			System.out.println("Second loop "+i);
	}
}
public class Mutliplethreads {

	public static void main(String[] args) throws Exception{
		Thread ct1 = new Thread(new SecondThread());
		ct1.start();
		SecondThread st = new SecondThread();
		for(int i=1;i<=100;i++)
			System.out.println("First loop "+i);
	}

}
class SecondThread
{
	
	public SecondThread() extends thead;
	{
	    
		t.start();
	}
	public  void run()
	{
		for(int i=1;i<=1000;i++)
			System.out.println("Second loop "+i);
	}
}
public class Mutliplethreads {

	public static void main(String[] args) throws Exception {
		SecondThread st = new SecondThread();
		for(int i=1;i<=1000;i++)
			System.out.println("First loop "+i);
	}

}*/