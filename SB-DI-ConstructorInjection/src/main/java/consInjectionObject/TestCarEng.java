package consInjectionObject;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarEng {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-obj-careng.xml");
		Car car = (Car) app.getBean("car");
		car.display();
		
	}
}
