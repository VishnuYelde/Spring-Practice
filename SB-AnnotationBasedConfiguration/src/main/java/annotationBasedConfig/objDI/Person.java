package annotationBasedConfig.objDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	// Field Injection
//	@Value(value = "Tony")
	private String name;

	// Field Injection
//	@Autowired  // It is used to inject the object
	private Mobile mobile;

//	@Value(value = "Tony")   // Setter Injection
	public void setName(String name) {
		this.name = name;
	}

//	@Autowired    // Setter Injection
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

//	@Autowired  // It used only for 1 Parameterized Constructor to Inject Object
	public Person(@Value(value = "Tony") String name, @Autowired Mobile mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public void display() {
		System.out.println("============Person Data============");
		System.out.println("Name: " + name);
		System.out.println("Mobile: " + mobile);
	}
}
