import java.util.LinkedList;

public class Linkedlist {
	public static void main (String[] args)
	{
		LinkedList<String> llist = new LinkedList<>();
		llist.add("welcome");
		llist.add("banana");
		llist.add("apple");
		llist.add("hello");
		llist.remove(2);
		for(String s:llist)
			System.out.println(s);
		//there will be no emty element or beggining element as arraylist in this
		
	}

}
