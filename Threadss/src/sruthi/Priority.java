package sruthi;
class ChildThread1  implements Runnable
{
	Thread t;
	int priority;
	boolean flag = true;
	volatile long x =0L;
	public ChildThread1(String name,int priority)                                              //public ChildThread() 
	{
	    t= new Thread(this,name);
	    this.t.setPriority(priority);
		t.start();
	}
	public  void run()
	{
		while(flag)
		     x++;
		System.out.println(t.getName()+"is terminating");
	}
	public void stop()
	{
		flag = false;
	}
}
public class Priority {

	public static void main(String[] args) throws Exception {
	
		ChildThread1 hpt = new ChildThread1("HP CHILD",8);
		ChildThread1 lpt = new ChildThread1("lp CHILD",3);
		try
		{
			Thread.sleep(3000);
			
		}
		catch(InterruptedException ex)
		{
	
		System.out.println(ex);
	}
	hpt.stop();
   lpt.stop();
   try
   {
	   hpt.t.join();
	   lpt.t.join();
   }
   catch(InterruptedException ex)
   {
	   System.out.println(ex);
   }
   System.out.println("hpt exceuted for  "+hpt.x);
   System.out.println("lpt exceuted for  "+lpt.x);
   System.out.println("main is  terminated" );
		}
	}

