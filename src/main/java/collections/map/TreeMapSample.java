package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

  public static void main(String[] args) {
    Map<String, String> treeMap=new TreeMap<>();
    Map<String, String> reverseTreeMap=new TreeMap<>(Comparator.reverseOrder());
    Map<CustomClass, String> treeMapCustomClass=new TreeMap<>();
    CustomClass obj=new CustomClass();
    for(int i=0; i<5; i++){
      treeMap.put(String.valueOf(i),String.valueOf(i));
    }
    //keys 1, 2, 3,4
    System.out.println(treeMap);
    //Exception can't be cast to comparable
    //treeMapCustomClass.put(new CustomClass(),"3");
    reverseTreeMap.putAll(treeMap);
    //keys 4,3,2,1
    System.out.println(reverseTreeMap);
    System.out.println("ceiling 3: "+((TreeMap<String, String>) treeMap).ceilingEntry("3"));
    System.out.println("floor 3: "+((TreeMap<String, String>) treeMap).floorKey("3"));
  }
}
class CustomClass{
}