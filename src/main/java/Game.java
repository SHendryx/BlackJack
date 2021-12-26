package main.java;

public class Game {
  private static Game gameInstance = new Game();

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

  }

  public static Game getInstance(){
    return gameInstance;
  }
}
