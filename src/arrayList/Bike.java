package arrayList;

public class Bike {

	private String name;
	private int price;
	private int tax;
	private String colour;
	
	public Bike(String name, int price, int tax, String colour) {
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", price=" + price + ", tax=" + tax + ", colour=" + colour + "]";
	}
	
	
	
	
}
