package main.java;

public class DealerHand extends Hand{

  public void showHand(){
    StringBuilder dealerHand = new StringBuilder();
    for (Card c : hand){
      if (c != hand.get(0)){
        dealerHand.append("Dealer is showing one card down");
      } else {
        dealerHand.append(" and ").append(c.toString());
      }
    }
  }
}
