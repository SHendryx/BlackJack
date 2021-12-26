package main.java;

public class Game {
  private static final Game gameInstance = new Game();

  private Deck gameDeck;
  private Hand dealerHand;
  private Hand playerHand;

  private Game(){
    // Create a new deck of cards and shuffle it.
    Deck gameDeck = new Deck();
    gameDeck.shuffle();

    // Create two hands. One for dealer, one for player.
    Hand dealerHand = new Hand();
    Hand playerHand = new Hand();

    dealerHand.addCard(gameDeck.getNext());

  }

  public static Game getInstance(){
    return gameInstance;
  }

  public void showHands(){
    System.out.println("The Dealer Has: " + dealerHand.toString() + " " + dealerHand.getHandValue());
    System.out.println("The Player Has: " + playerHand.toString() + " " + playerHand.getHandValue());
  }
}
