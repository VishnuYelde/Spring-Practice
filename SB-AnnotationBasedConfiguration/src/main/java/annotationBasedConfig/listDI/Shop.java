package annotationBasedConfig.listDI;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shop {

	@Value(value = "Mobile")
	private String name;

	@Autowired
	private Map<String, Double> items;

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("==========Shop Items==========");

		for (Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item.getKey() + " --> " + item.getValue());
		}
	}
}
