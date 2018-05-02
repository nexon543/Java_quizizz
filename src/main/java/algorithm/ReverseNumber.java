package algorithm;


public class ReverseNumber {

	public static int reverseNumber(int num) throws IllegalArgumentException
	{
		if (num/10==0)
			return num;
		if (num<0)
			throw new IllegalArgumentException();
		int reversed=0;
		int countNullsInFront=0;
		while (num > 0)
		{
			reversed*=10;
			int remainder=num%10;
			reversed+=remainder;
			if (reversed==0&&remainder==0)
				countNullsInFront++;
			else
				if (countNullsInFront>0)
				{
					reversed*=10^countNullsInFront;
					countNullsInFront=0;
				}
			num/=10;
		}
		return reversed;
	}
	public static void main(String[] args) {
		
		checkMethod(10);
		checkMethod(11223344);
		checkMethod(-12);
		
	}
	public static void checkMethod(int num) {
		System.out.println("Number: "+ num);
		int reversed=reverseNumber(num);
		System.out.println("Reversed: "+reversed);
	}

}
