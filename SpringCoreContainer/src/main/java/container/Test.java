package container;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config.xml");

		
		// Deprecated XmlBeanFactory()
//		XmlBeanFactory is deprecated in Spring 3,
//		removed in Spring 4,
//		no longer available in Spring 5 or 6.

//		BeanFactory bf = new XmlBeanFactory(resource);  // Core Container
//		Student student = (Student) bf.getBean("myStudent");

//		student.play();
	}
}
