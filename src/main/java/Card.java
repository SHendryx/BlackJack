package main.java;

public class Card {
  private Rank rank;
  private Suit suit;

  public Card(Rank r, Suit s){
    this.rank = r;
    this.suit = s;
  }

  public String getUnicode() {
    StringBuilder myUnicode = new StringBuilder();


    return myUnicode.toString();
  }

  @Override
  public String toString() {
    StringBuilder myCardString = new StringBuilder();
    myCardString.append(this.rank).append(" of ").append(this.suit);
    return myCardString.toString();
  }
}