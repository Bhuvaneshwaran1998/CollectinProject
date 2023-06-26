package hashMap;

import java.util.Objects;

public class Car {
	private int no;
	private String brand;
	private int price;
	private String colour;
	public Car(int no, String brand, int price, String colour) {
		super();
		this.no = no;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [no=" + no + ", brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand);
	}
	
	

}
