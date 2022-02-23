package qaace22training;


import java.util.Collections;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> Mylist = new HashSet<String>();
		System.out.println(Mylist.isEmpty());
		
		Mylist.add("BTS");
		Mylist.add("Twice");
		Mylist.add("EXO");
		Mylist.add("EXO");
		Mylist.add("Tomorrow x Together");
		Mylist.add("Enhypen");
		Mylist.add("Izone");
		Mylist.add("Loona");
		Mylist.add("Itzy");
		Mylist.add("Ateez");
	
		System.out.println(Mylist);
		
		
		
		
		
		
		Mylist.add("Bangtan Sonyeondan");
		System.out.println(Mylist);
		Mylist.remove(8);
		System.out.println(Mylist);
		
		
		 for(String list:Mylist)    



	            System.out.println(list);
		
	
		}
			
		}

	


