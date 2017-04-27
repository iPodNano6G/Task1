package lab7_201620932;

public abstract class Product {
	private double price;
	
	Product() {}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String getName();
}
