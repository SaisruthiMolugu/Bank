import java.util.ArrayList;

import java.util.ListIterator;
class Aray_list
{
	public static void main(String[] args)
	{
      ArrayList<String> slist= new ArrayList<>();//it has inbuilt functions like add,size,contain that is search
     System.out.println("Empty  :-"+slist.isEmpty());
      slist.add("one");
      slist.add("two");
      slist.add("three");
      slist.add("four");
      slist.add(3,"Five");// it adds the element at 3rd position with index 2
   //  for(int i=0;i<slist.size();i++)
   // System.out.println(slist.get(i));
    //  System.out.println(slist.size());
    //  System.out.println("Empty  :-"+slist.isEmpty());
    //  System.out.println(slist.contains("Apple"));
    /*  for(String s:slist)
    	  System.out.println(s);  for printing the elements using for each*/
      
      ListIterator<String> itr = slist.listIterator();
      while(itr.hasNext())   //if it has the next element we use this and it prints in normal order .(hasNext() and has .Previous() first ponts towards empty and checks the condition
    	  System.out.println(itr.next());
      
      while(itr.hasPrevious())    //if it has the next element we use this and it prints in reverse order
          System.out.println(itr.previous());  
         //  System.out.println(slist.remove(2)+"is deleted");//this is through index
      //slist.clear() clears all the elemets
      System.out.println(slist.remove("three")); //it return true if deleted
           for(String s:slist)
         	  System.out.println(s);
      //only in list we can delet the element in two ways:1 by index, 2  by elemt
         
      
	}    
}
