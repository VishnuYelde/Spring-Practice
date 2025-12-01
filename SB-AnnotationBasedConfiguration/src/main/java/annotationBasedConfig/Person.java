package annotationBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Field/ Variables Injection

@Component
public class Person {

	@Value(value = "King")
	private String name;

	@Value(value = "12th")
	private String std;

	public void display() {
		System.out.println("============Student Data============");
		System.out.println("Name: " + name);
		System.out.println("STD: " + std);
	}

	public void sing() {
		System.out.println("Person is singing");
	}
}
