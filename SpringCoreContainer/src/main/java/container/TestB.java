package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config-a.xml");
		Student student = (Student) app.getBean("student"); // pass the bean class id to the getBean() method
		student.play();

		System.out.println("====================================");

		Mobile mobile = (Mobile) app.getBean("mobile");
		mobile.song();
	}
}
