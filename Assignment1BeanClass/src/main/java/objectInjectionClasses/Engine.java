package objectInjectionClasses;

public class Engine {
	private int cc;

	public void display() {
		System.out.println("==========Engine Details==========");
		System.out.println("CC: " + cc);
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + "]";
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
