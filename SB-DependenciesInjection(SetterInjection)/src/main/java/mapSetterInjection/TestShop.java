package mapSetterInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShop {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-map-shop.xml");
		Shop s1 = (Shop) app.getBean("shop");
		s1.display();
	}
}
