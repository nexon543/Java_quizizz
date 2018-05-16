package algorithm;

public class StringOperations {

  public static void main(String[] args) {
    recursivelyReverseSample();
  }

  public static void recursivelyReverseSample(){
    String inputString="reversing string";
    String result=recursivelyReverse(inputString);
    System.out.println(result);
    System.out.println(recursivelyReverse(result));
  }

  public static String recursivelyReverse(String inputString){
    char[]inputStringChars=inputString.toCharArray();
    recursivelyReverseCharArray(inputStringChars, 0);
    return new String(inputStringChars);
  }
  public static void recursivelyReverseCharArray(char [] charArray, int currentIndex){
    swapElements(charArray, currentIndex);
    currentIndex++;
    if (currentIndex==charArray.length/2){
      return;
    }
    recursivelyReverseCharArray(charArray, currentIndex);
  }
  static void swapElements(char [] array, int offset){
    int offsetFromRight=array.length-1-offset;
    array[offset]+=array[offsetFromRight];
    array[offsetFromRight]=(char)(array[offset]-array[offsetFromRight]);
    array[offset]-=array[offsetFromRight];
  }
}

