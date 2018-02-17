package string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheMostCommonString {

	static List<String> listOfStr;
	public static void main(String[] args) {
		Map <String, Integer> m=new HashMap();
		listOfStr=new ArrayList<>() ;
		listOfStr.add("str1");
		listOfStr.add("str2");
		listOfStr.add("str2");
		for (String s:listOfStr)
		{
			Integer freq=m.get(s);
			m.put(s, (freq==null)?1:freq+1);
		}
		
		for (Map.Entry<String, Integer> e : m.entrySet())
		    System.out.println(e.getKey() + ": " + e.getValue());
		
		Map<String, Long> counted = listOfStr.stream()
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		String mostCommonString=counted.entrySet().stream().max((entry1, entry2)->entry1.getValue()>entry2.getValue()?1:-1).get().getKey();
	        System.out.println(counted);
	        System.out.println(mostCommonString);
	}

}
