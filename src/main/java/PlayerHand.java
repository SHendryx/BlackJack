package main.java;

public class PlayerHand extends Hand{

  public void showHand(){
    StringBuilder playerHand = new StringBuilder();
    playerHand.append("Player has a ");
    for (Card c : hand){
      if (c == hand.get(0)){
        playerHand.append(" a ").append(c.toString());
      } else {
        playerHand.append(" and ").append(c.toString());
      }
    }
  }
}
