package consInjectionMap;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShop {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-map-shop.xml");
		Shop shop = (Shop) app.getBean("shop");
		shop.display();
	}
}
