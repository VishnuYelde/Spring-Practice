package annotationBasedConfig.objDI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Value(value = "Poco X5")
	private String brand;

	@Value(value = "20000")
	private double price;

	public void display() {
		System.out.println("===========Mobile Data===========");
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}

	public void ring() {
		System.out.println("Phone Ringing.....");
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}

}
