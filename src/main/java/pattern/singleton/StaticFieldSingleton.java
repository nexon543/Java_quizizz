package pattern.singleton;

public class StaticFieldSingleton {
	public static final StaticFieldSingleton instance=new StaticFieldSingleton();
	
	private StaticFieldSingleton() {}
	public static StaticFieldSingleton getInstance() {
		return instance;
	}
	public void print() {
		System.out.println("I'm a singltone!");
	}
	
	public static void main(String[] args) {
		StaticFieldSingleton i=StaticFieldSingleton.getInstance();
		i.print();
	}
}
