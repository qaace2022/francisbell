package qaace22training;


import java.util.Collections;
import java.util.LinkedList;


public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Mylist = new LinkedList<String>();
		System.out.println(Mylist.isEmpty());
		
		Mylist.add("BTS");
		Mylist.add("Twice");
		Mylist.add("EXO");
		
		Mylist.add("Tomorrow x Together");
		Mylist.add("Enhypen");
		Mylist.add("Izone");
		Mylist.add("Loona");
		Mylist.add("Itzy");
		Mylist.add("Ateez");
		
		Mylist.addFirst("V");
		Mylist.addLast("Tzuyu");
		System.out.println(Mylist);
		
		Mylist.removeFirst();
		Mylist.remove("Tzuyu");
		System.out.println(Mylist);
		
	
		System.out.println("Before sorting: "+ Mylist);
		Collections.sort(Mylist);
		System.out.println(Mylist);
		
		
		System.out.println(Mylist.size());
		System.out.println(Mylist.get(2));
		
		Mylist.add(0, "Bangtan Sonyeondan");
		System.out.println(Mylist);
		Mylist.remove(8);
		System.out.println(Mylist);
		
		  for (String list : Mylist)



	          System.out.print(list + " ");

	}

}
