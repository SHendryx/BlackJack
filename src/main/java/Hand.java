package main.java;

import java.util.ArrayList;
import java.util.List;

public class Hand {

  List<Card> hand;

  public Hand(){
    // A basic hand contains 2 cards. It won't be too labor-intensive to add cards to the hand.
    this.hand = new ArrayList<>(2);
  }

  public int getHandValue(){
    int handValue = 0;
    int numAces = 0;

    for (Card c : this.hand) {
      // We'll add the hard value of every card and later add the soft value (+10) for ACES if we
      // can.

      if (c.getRank() == Rank.ACE){
        numAces++;
      }
      handValue += c.getValue();

      for (int i = 0; i < numAces; i++){
        if (handValue + 10 < 21){
          handValue += 10;
        }
      }
    }

    return handValue;
  }
}
