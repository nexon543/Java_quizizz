package oop.inheretance.static_methods_fields;

public class B extends AbstractA {
	
	static {
		var="Initialized in B";
	}
	public static void overridenFunc2() {System.out.println("overridenFunc2() in B");}
	
	public static void overridenFunc() {
		System.out.println("overridenFunc() in B");
		overridenFunc2();
	}
}
