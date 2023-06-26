package arrayList;

import java.util.ArrayList;

public class UseMarket {

	public static void main(String[] args) {
		
		Market m1=new Market("Digital Market",01,50000,"chennai",false);
		Market m2=new Market("Food Market",02,30000,"Thiruchi",true);
		Market m3=new Market("Fish Market",03,40000,"Madhurai",true);
		Market m4=new Market("veg Market",04,50000,"chennai",true);
		Market m5=new Market("Super Market",05,20000,"pandy",false);
		Market m6=new Market("mobile Market",06,30000,"cuddalore",false);
		
		ArrayList <Market> m = new ArrayList<>();
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		m.add(m6);
		
		System.out.println(m);
		
//Enhanced forLoop
		
		System.out.println("***************enhanced for Loop**************");
		for(Market a:m) {
			System.out.println(a);
		}
		
//enhanced With Condition
		
		System.out.println("*****************condition******************");
		for(Market b:m) {
			if(b.getStoreLocation().startsWith("c")) {
				System.out.println(b);
			}
		}
		System.out.println("************");
		for(Market c:m) {
			if(c.getStoreName().contains("Digital Market")) {
				System.out.println(c);
				
			}
		}
		
//forEach lambda Expersion
		
		System.out.println("***************for Each Lambda***************");
	
		m.forEach(x->System.out.println(x));
		
//for Each condition
		
		System.out.println("***************condition***************");
		
		m.forEach(x->{
			if(x.getStoreLocation().startsWith("t")) {
				System.out.println(x.getStoreLocation());
			}
		});
		
//For Loop  
		
		System.out.println("**************For Loop****************");
		for(int i=0; i<m.size();i++) {
			System.out.println(m.get(i));
		}
		
// for loop with Condition 
		
		System.out.println("*********************condition*************************");
		
		for(int i=0; i<m.size();i++) {
			if(m.get(i).getStoreLocation().contains("c")) {
				System.out.println(m.get(i).getStoreName());
			}
			
		}
		
		
			 	
	}
 }


