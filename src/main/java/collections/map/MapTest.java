package collections.map;

import java.util.HashMap;
import java.util.Map;


public class MapTest {

	public static void forEachIteration() {}
	public static void lambdaIteration() {}

	public static void main(String[] args) {
		changeKeyValue();
	}

	public static void changeKeyValue(){
		Map<Integer, Integer> map = new HashMap<>();
		Integer key=1;
		Integer value=1;
		map.put(key, value);
		System.out.println("Same key value: "+ map.get(key));
		key++;
		Integer valueByChangedKey=map.get(key);
		System.out.println("Changed key value: "+ valueByChangedKey);
		System.out.println("New same key value: "+ map.get(1));
	}

	class ChangableType{
		int value=0;
	}
}
