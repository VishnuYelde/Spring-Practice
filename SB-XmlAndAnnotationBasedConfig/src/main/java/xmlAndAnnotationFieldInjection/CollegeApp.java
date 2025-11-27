package xmlAndAnnotationFieldInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollegeApp {
	private String name;
	private String address;

	public void display() {
		System.out.println("==============College Data==============");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}

	public void exams() {
		System.out.println("Exam is going to held soon");
	}

	// Use Value annotation before Parameter of the Constructor for Constructor Injection
	public CollegeApp(@Value(value = "Thane College") String name, @Value(value = "Thane") String address) {
		super();
		this.name = name;
		this.address = address;
	}

}
