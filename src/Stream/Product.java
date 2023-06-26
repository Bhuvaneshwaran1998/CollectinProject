package Stream;

public class Product {
	private String brand;
	private int price;
	private String colour;
	private String model;
	private boolean isWaterProof;
	public Product(String brand, int price, String colour, String model, boolean isWaterProof) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.model = model;
		this.isWaterProof = isWaterProof;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isWaterProof() {
		return isWaterProof;
	}
	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", price=" + price + ", colour=" + colour + ", model=" + model
				+ ", isWaterProof=" + isWaterProof + "]";
	}
	
	

}
