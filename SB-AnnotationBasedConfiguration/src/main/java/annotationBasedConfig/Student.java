package annotationBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Constructor Injection

@Component
public class Student {

	private String name;
	private int age;

	public void display() {
		System.out.println("==========Student Data==========");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public Student(@Value(value = "Allen") String name, @Value(value = "22") int age) {
		this.name = name;
		this.age = age;
	}
}
