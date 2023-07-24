import java.util.HashSet;
import java.util.Iterator;
public class Set {

	public static void main(String[] args) {
		HashSet<String> h =new HashSet<>(25);
		h.add("hello");
		h.add("welcome");
		h.add("apple");
		h.add("banana");
		h.add("dragon");
		h.add(null);
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.contains("hello"));
		System.out.println(h.add("apple"));//return false that indicates no more duplicates can be added
	 for(String s:h)
		 System.out.println(s);
		// TODO Auto-generated method stub
  Iterator<String> itr = h.iterator();
  while(itr.hasNext())
	  System.out.println(itr.next());
		  
	
	}
}
