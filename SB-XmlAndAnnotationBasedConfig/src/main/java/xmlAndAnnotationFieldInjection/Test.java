package xmlAndAnnotationFieldInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = (Student) app.getBean("student");
		s1.display();
		s1.study();

		Person p1 = (Person) app.getBean("person");
		p1.display();
		p1.play();

		CollegeApp c1 = (CollegeApp) app.getBean("collegeApp");
		c1.display();
		c1.exams();

		MI mi = (MI) app.getBean("myMI");
		mi.play();

	}
}
