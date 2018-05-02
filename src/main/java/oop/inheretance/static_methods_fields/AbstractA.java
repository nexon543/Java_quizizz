package oop.inheretance.static_methods_fields;

public abstract class AbstractA {
	
	
	public static String var="Initialized in A";
	
	public static void overridenFunc() {
		System.out.println("overridenFunc() in A");
		overridenFunc2();
	} 
	
	public static void inheretedFunc() {
		System.out.println("InheretedFunc from A"); 
		overridenFunc2();
	}
	
	public static void overridenFunc2() {
		System.out.println("overridenFunc2() in A");
	}
}
