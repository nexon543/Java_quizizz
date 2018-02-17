package string;

public class FindSubstring {

	static String str, subStr;
	static void findUsingStringMethods()
	{
		str="onetwoonetwothreefourfivethree";
		subStr="three";
		int firstOccurance=str.indexOf(subStr);
		System.out.println("The first occurance of substr:"+firstOccurance);
		int lastOccurance=str.lastIndexOf(subStr);
		System.out.println("The last occurance of substr:"+lastOccurance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
