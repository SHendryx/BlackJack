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
    StringBuilder myString = new StringBuilder();
    int codePoint = 127136;
    switch (this.suit){
      case CLUBS:
        codePoint += this.rank.value;
        char[] charPair = Character.toChars(codePoint);
        String symbol = new String(charPair);
        myString.append(symbol);
        break;
      default:
        myString.append(rank + " of " + suit);
    }
    return myString.toString();
  }
}