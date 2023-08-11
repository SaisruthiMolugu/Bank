package sruthi;
class Queue 
{
	int element;
	boolean flag = true;
	synchronized public void read()
	{
		if(!flag)
        {
       	 System.out.println("Read   :"+element);
       	 flag = true;
       	 notify();
        }
        try
        {
       	 wait();
        }
        catch(InterruptedException ex)
        {
       	 ex.printStackTrace();
        }
	}
	synchronized public void write(int n)
	{
                 if(flag)
                 {
                	 this.element = n;
                	 System.out.println("written   :"+element);
                	 flag = false;
                	 notify();
                 }
                 try
                 {
                	 wait();
                 }
                 catch(InterruptedException ex)
                 {
                	 ex.printStackTrace();
                 }
	}
}
class ReadThread implements Runnable
{
	Thread t;
	Queue q;
	
	public ReadThread(Queue q)
	{
		t=new Thread(this);
		this.q = q;
		t.start();
	}
	public void run()
	{
		while(true)
			q.read();
		
	}
}
class WriteThread implements Runnable
{
	Thread t;
	Queue q;
	public WriteThread(Queue q)
	{
		t= new Thread(this);
		this.q = q;
		t.start();
	}
	public void run()
	{
		int n=1;
		while(true)
			q.write(n++);
	}
}
public class Waitsss {
public static void main(String[] args)
{
	Queue queue = new Queue();
	ReadThread readThread = new ReadThread(queue);
	WriteThread writethread = new WriteThread(queue);
	try
	{
		readThread.t.join();
		writethread.t.join();
	}
	catch(InterruptedException ex)
	{
		System.out.println(ex);
	}
	System.out.println("Main is terminating");
}
}
