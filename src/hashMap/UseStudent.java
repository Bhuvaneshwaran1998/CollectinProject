package hashMap;

import java.util.HashMap;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Bhuvaneshwaran",01,"Mechanical",6);
		Student s2=new Student("Nithyan",02,"Mechanical",7);
		Student s3=new Student("Abi",03,"ECE",7);
		Student s4=new Student("Karan",04,"Mechanical",6);
		Student s5=new Student("Divya",05,"ECE",8);
		Student s6=new Student("Ranjini",06,"Bio",7);
		
		HashMap <Integer,Student> s=new HashMap<>();
		
		s.put(s1.getId(), s1);
		s.put(s2.getId(), s2);
		s.put(s3.getId(), s3);
		s.put(s4.getId(), s4);
		s.put(s5.getId(), s5);
		s.put(s6.getId(), s6);
		
		
		System.out.println(s);
		
		//Enhanced For Loop
		System.out.println("*******************Enhanced For******************");
		
		// Enhanced values
		for(Student a:s.values()) {
			System.out.println(a);
		}
		
		//Enhanced keySet
		
		for (Integer b:s.keySet()) {
			System.out.println(b);
		}
		
		//Condition with Enhanced for Loop
		
		for (Student c:s.values()) {
			if(c.getDeperment().equalsIgnoreCase("bio")) {
				System.out.println(c);
			}
		}
		
		// For Loop 
		System.out.println("**************For Loop************");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
	
		
		
		
		
		
		
		
		
		
		


	}

}
