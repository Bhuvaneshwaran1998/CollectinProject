package hashMap;

public class Bike {
	private String brand;
	private int registerNo;
	private String color;
	private int price;
	String name;
	private boolean isPetrol;

	public Bike(String brand, int registerNo, String color, int price, boolean isPetrol) {
	this.brand = brand;
	this.registerNo = registerNo;
	this.color = color;
	this.price = price;
	this.isPetrol = isPetrol;
	}

	public String getBrand() {
	return brand;
	}

	public void setBrand(String brand) {
	this.brand = brand;
	}

	public int getRegisterNo() {
	return registerNo;
	}

	public void setRegisterNo(int registerNo) {
	this.registerNo = registerNo;
	}

	public String getColor() {
	return color;
	}

	public void setColor(String color) {
	this.color = color;
	}

	public int getPrice() {
	return price;
	}

	public void setPrice(int price) {
	this.price = price;
	}

	public boolean getIsPetrol() {
	return isPetrol;
	}

	public void setIsPetrol(boolean isPetrol) {
	this.isPetrol = isPetrol;
	}

	public String toString() {
	return brand + " " + registerNo + " " + color + " " + price + " " + isPetrol;
	}

}


