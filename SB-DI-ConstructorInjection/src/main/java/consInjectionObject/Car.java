package consInjectionObject;

public class Car {
	private String brand;
	private double price;
	private Engine engine;

	public void display() {
		System.out.println("===========Car Data===========");
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Engine: " + engine);
	}

	public Car(String brand, double price, Engine engine) {
		super();
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}

}
