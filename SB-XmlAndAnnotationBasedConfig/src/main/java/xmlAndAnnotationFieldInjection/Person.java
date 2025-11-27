package xmlAndAnnotationFieldInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private int age;

	public void display() {
		System.out.println("=========Person Data=========");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	// Use Value annotation and give value for Setter Injection
	
	@Value(value = "Allen")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "22")
	public void setAge(int age) {
		this.age = age;
	}
	
	public void play() {
		System.out.println("Person is Playing");
	}
}
