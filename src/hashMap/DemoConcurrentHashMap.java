package hashMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {
	public static void main(String args[]) {
		//ConcurrentHashMap <Integer,String> h=new ConcurrentHashMap<>();
		HashMap <Integer,String> h=new HashMap<>();
		h.put(10, "nithyan");
		h.put(11, "gugan");
		h.put(12, "gogul");
		h.put(14, "bhuvi");
		h.put(15, "vicky");
		
		System.out.println(h.values());
		System.out.println(h.keySet());
		
		// in hash map try to put any value is will show the error
		// we need use the concurrentHashMap avoid the error;
		
		for(String b:h.values()) {
			System.out.println(b);
			//System.out.println(h.put(19, "saravana"));
		}
		
	}

}
