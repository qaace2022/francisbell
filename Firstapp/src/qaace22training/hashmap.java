package qaace22training;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> members = new HashMap();
		
		members.put("RM", 1994);
		members.put("JIN", 1992);
		members.put("SUGA", 1993);
		members.put("JHOPE", 1994);
		members.put("JIMIN", 1995);
		members.put("V", 1995);
		members.put("JUNGKOOK", 1997);
		
		System.out.println("Size" + members);
		System.out.println("members - " + members);
		System.out.println("contains key - " + members.containsKey ("RM"));
		System.out.println("contains key - " + members.containsKey("SANA"));
		System.out.println("JHOPE Liner - " + members.get("JHOPE") );
		System.out.println("entry set - " + members.entrySet());
		System.out.println("entry set - " + members.keySet());
		System.out.println("entry set - " + members.values());
		
		 for(Entry<String, Integer> list: members.entrySet());    



	           System.out.println(members);
		
	
	}

}
