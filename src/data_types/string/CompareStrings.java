package data_types.string;


public class CompareStrings {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		System.out.println("Compare references (literals):"+(s1==s2));
		s2=new String("Java");
		System.out.println("Compare references (literal and object):"+(s1==s2));
		s1=new String ("Java");
		System.out.println("Compare references (object and object):"+(s1==s2));
		
		Integer i1=new Integer(2);
		Integer i2=new Integer(2);
		System.out.println("Compare Integer references (object and object):"+(i1==i2));
	}

}
