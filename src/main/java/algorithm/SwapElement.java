package algorithm;

public class SwapElement {

  public static void main(String[] args) {
    int one=1;
    int two=2;
    one+=two;
    two=one-two;
    one-=two;
    System.out.println("One: "+one+"; Two: "+two);
  }
}
