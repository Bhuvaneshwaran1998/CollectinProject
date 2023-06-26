package hashMap;

import java.util.Hashtable;

public class HashTable {
	public static void main(String args[]) {
		Hashtable <Integer,String> h=new Hashtable<>();
		h.put(1, "bhuvi");
		h.put(2, "lalith");
		h.put(19 , "Dinesh");
		h.put(32, "newlin");
		h.put(32, "hari");
		//h.put(null, null);
		
		for(Integer a:h.keySet()) {
			System.out.println(a.hashCode()%16);
		}
		System.out.println(h);
	}

}
