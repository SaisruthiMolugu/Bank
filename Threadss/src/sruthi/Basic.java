package sruthi;

public class Basic {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); //return the refenece of current(main threadin this case) thread
		System.out.println("Thread name  "+t.getName());
        System.out.println("Thread priority    "+t.getPriority());
        System.out.println("Thread group       "+t.getThreadGroup());
    t.setName("Firstthraed");
    t.setPriority(1);
  
    System.out.println("Thread name  "+t.getName());
    System.out.println("Thread priority    "+t.getPriority());
      System.out.println("MINIMUM PRIORITY  "+Thread.MIN_PRIORITY);
      System.out.println("minimum priority   "+Thread.MAX_PRIORITY); 
      System.out.println("default      "+Thread.NORM_PRIORITY); 
	}

}
