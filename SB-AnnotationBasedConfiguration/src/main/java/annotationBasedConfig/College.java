package annotationBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Setter Injection

@Component
public class College {
	private String name;
	private String address;

	@Value(value = "Thane College")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "Thane")
	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("===========College Data===========");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}

}
