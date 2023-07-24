import java.util.ArrayList;
public class Array_list21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> slist1 = new ArrayList<>();
		slist1.add("apple");
		slist1.add("hi");
		slist1.add("welcome");
		ArrayList<String> slist2 = new ArrayList<>();
		slist2.add("banana");
		slist2.add("zeba");
		slist2.add("apple");
		slist2.add("welcome");
   //	System.out.println(slist1.removeAll(slist2)); // returns the eleemnts which are differ in slist1 by comparing 1 and 2
	System.out.println(slist1.retainAll(slist2));//return the elements which are same in bothh lists
		for(String s:slist1)
			System.out.println(s);
		slist1.containsAll(slist2);//returns true if all the elements of 2 are in 1 otherwise false

	}

}



/*

ArrayList<Integer> slist3 = new ArrayList<>();
slist3.add(1);
slist3.add(2);
slist3.add(4);
ArrayList<Integer> slist4 = new ArrayList<>();
slist4.add(5);
slist4.add(6);
slist3.addAll(slist4);
for(Integer s:slist3)
	System.out.println(s);
*/