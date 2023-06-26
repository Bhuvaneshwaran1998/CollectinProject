package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("apple",40000,"block","7-plus",true);
		Product p2=new Product("Redmi",20000,"white","note-11",false);
		Product p3=new Product("MI",25000,"blue","A1",false);
		Product p4=new Product("poco",30000,"silve","p1+",true);
		Product p5=new Product("oppo",35000,"green","A5k",false);
		Product p6=new Product("vivo",28000,"block","v5",true);
		Product p7=new Product("vivo",28000,"block","v5",true);
		
		ArrayList <Product> p =new ArrayList<>();
		p.add(p6);
		p.add(p5);
		p.add(p4);
		p.add(p3);
		p.add(p2);
		p.add(p1);
		p.add(p6); 
		
		System.out.println(p);
		
		//stream
		System.out.println("***************Stream****************");
		p.stream().forEach(x->System.out.println(x));
		
		//filter
		System.out.println("***********Filter***************");
		p.stream().filter(x->x.getBrand().contains("apple")).forEach(x->System.out.println(x));
        
		//Map
		System.out.println("****************Map**************");
		
		p.stream().map(x->x.getBrand()).filter(x->x.startsWith("v")).forEach(x->System.out.println(x));
		
        p.stream().filter(x->x.getColour().equalsIgnoreCase("block")).map(x->x.getBrand()+x.getPrice()).forEach(x->System.out.println(x));
        
        //distrinct
         
        System.out.println("**************distinct******************");
        p.stream().distinct().forEach(x->System.out.println(x));
        
        //count
        System.out.println("**************Count*****************");
        
        long a= p.stream().filter(x->x.getPrice()>30000).count();
        System.out.println(a);
        
	    //toList
        System.out.println("*************ToList*****************");
        
        List <Product> d =p.stream().filter(x->x.getPrice()>25000).collect(Collectors.toList());
	    for(Product n:d) {
        System.out.println(d);
	    }
	
	    //toMap
	    System.out.println("**************ToMap*****************");
	    Map<Integer,Product> e=p.stream().filter(x->x.getBrand().contains("p")).collect(Collectors.toMap(x->x.getPrice(),y->y));
	    for(Product f:e.values()) {
	    	System.out.println(f);
	    }
	    
      //Sorted
//      System.out.println("***********Stored**************");
//      p.stream().sorted().forEach(x->System.out.println(x));
      
	    
	}

}



