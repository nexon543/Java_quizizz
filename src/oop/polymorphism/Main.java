package oop.polymorphism;

public class Main {
	public static void main(String[] args) {
		testStaticFunc();
	}
	
	
	
	private static void testStaticFunc() {
		A.staticFunc();
		B.staticFunc();
		A a=new B();
		a.staticFunc();
	}
}
