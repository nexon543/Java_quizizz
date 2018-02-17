package string;

import javax.xml.transform.Source;

public class CompareStrings {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		System.out.println("Compare references:"+(s1==s2));
		s1+='a';
		System.out.println("s1:"+s1);
		System.out.println("Compare references:"+(s1==s2));
		
	}

}
