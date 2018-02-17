package string;

public class StringHashCode {

	public static void generateStringHashCode()
	{
		System.out.println("-- How String hash code is generated --");
			System.out.println("A:" + ((int)'A'));
		    System.out.println("B:" + ((int)'B'));
		    System.out.println("a:" + ((int)'a'));

		    System.out.println("Aa".hashCode());
		    System.out.println("BB".hashCode());
		    System.out.println("Aa".hashCode());
		    System.out.println("BB".hashCode());


		    System.out.println("AaAa".hashCode());
		    System.out.println("BBBB".hashCode());
		    System.out.println("AaBB".hashCode());
		    System.out.println("BBAa".hashCode());
	}
	
	public static void stringIsEmpty() {
		System.out.println("\"\".isEmpty():"+"".isEmpty());
		System.out.println("new String().isEmpty():"+new String().isEmpty());
	}
	public static void main(String[] args) {
		
		//generateStringHashCode();
		stringIsEmpty();

	}

}
