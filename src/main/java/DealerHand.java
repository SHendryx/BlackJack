package main.java;

public class DealerHand extends Hand{

  public void showHand(){
    for (Card c : hand){
      if (c != hand.get(0)){
        StringBuilder showing = new StringBuilder();
        showing.append("Dealer is showing one card down");
        showing.append(" and ").append(c.toString());
      }
    }
  }
}
