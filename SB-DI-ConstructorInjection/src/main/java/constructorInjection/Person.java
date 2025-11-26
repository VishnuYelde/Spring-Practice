package constructorInjection;

public class Person {
	private String name;
	private int age;

	public void display() {
		System.out.println("==============Person Data==============");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
