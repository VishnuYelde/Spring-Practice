package annotationBasedConfig.objDI;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestObj {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p1 = app.getBean(Person.class);
		p1.display();
		
		Mobile m1 = app.getBean(Mobile.class);
		m1.display();
		m1.ring();
	}
}
