package annotationBasedConfig.theater;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Theater t1 = app.getBean(Theater.class);
		t1.playMovie();
		
//		Kantara m1 = app.getBean(Kantara.class);
//		m1.story();
	}
}
