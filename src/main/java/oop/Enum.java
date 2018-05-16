package oop;

public class Enum {

  public static void main(String[] args) {
    for(Card c:Card.values()){
      System.out.println(c);
    }
  }

}

enum Card{
  HEART, CLUB, SPADE, DIAMOND;
}