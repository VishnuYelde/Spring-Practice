package annotationBasedConfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Person p1 = app.getBean(Person.class);  // Field Injection
		p1.display();
		
		College c1 = app.getBean(College.class);  // Setter Injection
		c1.display();
		
		Student s1 = app.getBean(Student.class);  // Constructor Injection
		s1.display();
	}
}
