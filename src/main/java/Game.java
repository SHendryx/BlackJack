package main.java;

public class Game {
  private static Game gameInstance = null;

  private Deck gameDeck;
  private Hand dealerHand;
  private Hand playerHand;

  private Game(){
    // Create a new deck of cards and shuffle it.
    Deck gameDeck = new Deck();
    gameDeck.shuffle();

    // Create two hands. One for dealer, one for player.

  }

  public static Game Game(){
    if (gameInstance == null){
      gameInstance = new Game();
    }
    return gameInstance;
  }
}
