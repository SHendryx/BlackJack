package main.java;

public class Card {
  private Rank rank;
  private Suit suit;

  public Card(Rank r, Suit s){
    this.rank = r;
    this.suit = s;
  }

  public Rank getRank() {
    return rank;
  }

  public int getValue() {
    int value = 0;
    value += ;

    return value;
  }

  @Override
  public String toString() {
    StringBuilder myCardString = new StringBuilder();
    myCardString.append(this.rank).append(" of ").append(this.suit);
    return myCardString.toString();
  }
}