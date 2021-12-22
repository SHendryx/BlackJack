package main.java;

import java.util.ArrayList;
import java.util.List;

public class Deck{
  List<Card> deck = new ArrayList<>(52);

  public Deck(){
    for (Suit s : Suit.values()){
      for (Rank r : Rank.values()){
        deck.add(new Card(r, s));
      }
    }
  }

  public String toString(){
    StringBuilder stringOut = new StringBuilder();
    for (Card c : deck){
      stringOut.append(c.toString()).append("\n");
    }
    return stringOut.toString();
  }
}