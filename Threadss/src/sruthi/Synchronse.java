package sruthi;
class Printer //resource class
{
	synchronized public void print(String[] messages)  // without the word synchronize the all the
	                                                //messages will be printed jumbingle
	{
		for(String m:messages)
			System.out.print(m+"  ");
		System.out.println();
	}
}
class ChildThread3 implements Runnable   //thread class
{
	Thread t;
	Printer p;
	String[] messages;
	public ChildThread3(Printer p,String[] messages)
	{
		t = new Thread(this);
		this.p = p;
		this.messages = messages;
		t.start();
		}
	public void run()
	{
		p.print(messages);
	}
}
 class Synchronse
{
     public static void main(String[] args)
     {
    	 Printer printer = new Printer();
    	 ChildThread3 ct1= new ChildThread3(printer,new String[]{"Hello","Welcome","Byebye"});
    	 ChildThread3 ct2= new ChildThread3(printer,new String[]{"Banana","apple","mango"});
    	 ChildThread3 ct3= new ChildThread3(printer,new String[]{"aaaa","bbbbbb","ccccc"});
    	 try
    	 {
    		 ct1.t.join();
    		 ct2.t.join();
    		 ct3.t.join();
    	 }
    	 catch(InterruptedException ex)
    	 {
    		 System.out.println(ex);
    	 }
   System.out.println("Main is terminating");
    	 }
    	
     }

