package arrayList;

import java.util.ArrayList;

public class BikeUse {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Bike b1 = new Bike("R.E", 2000, 2000, "red");
		Bike b2 = new Bike("KTM", 1700, 1700, "orgin");
		Bike b3 = new Bike("Rx100", 150000, 1500, "blue");

		ArrayList<Bike> b = new ArrayList<>();

		b.add(b1);
		b.add(b2);
		b.add(b3);

		System.out.println("..........Min value........... ");

		int min = b.get(1).getPrice();
		for (Bike x : b) {
			if (x.getPrice() < min) {
				min = x.getPrice();
			}
		}
		System.out.println(min);
		
		System.out.println(".........max value...........");
		
		int max =b.get(1).getPrice();
		for(Bike y:b) {
			if(y.getPrice()>max) {
				max=y.getPrice();
			}
		}
		System.out.println(max);

		System.out.println("..........End of the program..............");
		System.out.println("..........justing checking...........");
	}

}
