package oop.class_object;

public class Final {

	private static final int staticFinalVar; //must be initialized (in declaration or static block)
	private final int finalVar;
	static {
		staticFinalVar=1;
	}
	{
		finalVar=3;
	}
	public Final() {
		//staticFinalVar=1; //error
		//finalVar=2; //initialized in logic block
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
