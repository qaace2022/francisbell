package qaace22training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collections {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> Mylist = new ArrayList<String>();
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
	
		System.out.println("Before sorting: "+ Mylist);
		Collections.sort(Mylist);
		System.out.println(Mylist);
		
		
		System.out.println(Mylist.size());
		System.out.println(Mylist.get(2));
		
		Mylist.add(0, "Bangtan Sonyeondan");
		System.out.println(Mylist);
		Mylist.remove(8);
		System.out.println(Mylist);
//		Mylist.clear();
		System.out.println(Mylist);
		
		for(int i = 2 ; i < Mylist.size(); i++) {
			System.out.println(Mylist.get(i));
		}
		for(String i :Mylist) {
			System.out.println(i);
		}
		for(Iterator iterator = Mylist.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		
		
		

	}

}
