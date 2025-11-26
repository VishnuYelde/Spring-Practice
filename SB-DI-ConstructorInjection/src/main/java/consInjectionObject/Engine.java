package consInjectionObject;

public class Engine {
	private int cc;

	public void start() {
		System.out.println("Engine Started");
	}

	public Engine(int cc) {
		super();
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + "]";
	}

}
