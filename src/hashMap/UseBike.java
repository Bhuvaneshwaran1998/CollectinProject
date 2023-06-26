package hashMap;

	import java.util.HashMap;
	import java.util.Iterator;

	public class UseBike {
	public static void main(String[] args) {
	Bike bike1 = new Bike("Hero", 9581, "Black", 84000, true);
	Bike bike2 = new Bike("Honda", 8532, "Black", 140000, true);
	Bike bike3 = new Bike("Aspire", 9681, "Blue", 80000, false);
	Bike bike4 = new Bike("Yamaha", 3567, "white", 180000, true);
	Bike bike5 = new Bike("Bajaj", 8900, "Black", 150000, true);
	Bike bike6 = new Bike("Hero", 3455, "blue", 75000, true);
	HashMap<Integer, Bike> bikes = new HashMap<>();
	bikes.put(bike1.getRegisterNo(), bike1);
	bikes.put(bike2.getRegisterNo(), bike2);
	bikes.put(bike3.getRegisterNo(), bike3);
	bikes.put(bike4.getRegisterNo(), bike4);
	bikes.put(bike5.getRegisterNo(), bike5);
	bikes.put(bike6.getRegisterNo(), bike6);
	 System.out.println(bikes);

	 System.out.println(bikes.keySet());
	System.out.println(bikes.values());

	 for (Integer x : bikes.keySet()) {
	 System.out.println(x);// key itreation
	 }
	
	 for (Bike b : bikes.values()) {
	 System.out.println(b);// values iteration
	 }
	
	for(Integer i :bikes.keySet()) {
	 System.out.println(bikes.get(i));

	}
	}
	
}



