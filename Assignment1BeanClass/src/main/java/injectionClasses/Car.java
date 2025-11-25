package injectionClasses;

public class Car {
	private String brand;
	private double price;
	private Engine engine;

	public void display() {
		System.out.println("==========Car Details==========");
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Engine: " + engine);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
