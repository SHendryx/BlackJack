package main.java;

public class PlayerHand extends Hand{

  public void showHand(){
    StringBuilder showing = new StringBuilder();
    showing.append("Player has a ");
    for (Card c : hand){
      if (c == hand.get(0)){
        showing.append(" a ").append(c.toString());
      } else {
        showing.append(" and ").append(c.toString());
      }
    }
  }
}
