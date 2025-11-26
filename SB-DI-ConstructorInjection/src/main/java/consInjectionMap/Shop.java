package consInjectionMap;

import java.util.Map;

public class Shop {
	private String name;
	private Map<String, Double> items;

	public void display() {
		System.out.println("===============Shop Data===============");
		System.out.println("Shop Name: " + name);
		System.out.println("=================Items=================");

		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

	public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}

}
