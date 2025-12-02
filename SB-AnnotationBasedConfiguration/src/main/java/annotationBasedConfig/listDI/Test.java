package annotationBasedConfig.listDI;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s1 = app.getBean(Student.class);
		s1.display();
		
		Shop shop1 = app.getBean(Shop.class);
		shop1.display();
	}
}