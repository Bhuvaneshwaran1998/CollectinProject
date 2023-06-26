package hashMap;

import java.util.Hashtable;

public class CarUse {
	public static void main(String args[]) {

		Car c1 = new Car(100, "bmw", 800000, "block");
		Car c2 = new Car(101, "maruthi", 700000, "yellow");
		Car c3 = new Car(102, "valvo", 900000, "block");
		Car c4 = new Car(32, "ferari", 500000, "blue");
		Car c5 = new Car(32, "ferari", 500000, "blue");


		Hashtable<Integer, Car> c = new Hashtable<>();
		c.put(c1.getNo(), c1);
		c.put(c2.getNo(), c2);
		c.put(c3.getNo(), c3);
		c.put(c4.getNo(), c4);
		c.put(c5.getNo(), c5);
		
		for(Car a:c.values()) {
			System.out.println(a.hashCode()%16);
		}
		System.out.println("............................");
		for(Integer d:c.keySet()) {
			System.out.println(d);
		}
		System.out.println("..............................");
		System.out.println(c4.equals(c5));
		System.out.println("................................");
		for(Car b:c.values()) {
			System.out.println(b);
		}
		
		//System.out.println(c.hashCode());

	}

}
