package xmlAndAnnotationFieldInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Using Component annotation execute Field Injection

@Component
public class Student {

	// Using Value annotation set value to the Variables

	@Value(value = "King")
	private String name;

	@Value(value = "king@gmail.com")
	private String email;

	public void study() {
		System.out.println("Student is Studying");
	}

	public void display() {
		System.out.println("==========Student Data==========");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}

}
