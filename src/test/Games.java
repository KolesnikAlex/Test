package test;

//: interfaces/Games.java
// Игровая библиотека с использованием фабрики
import test.Print;
 
interface Game { boolean move(); }
//interface GameFactory { Game getGame(); }
 
class Checkers implements Game {
  private int moves = 0;
  private static final int MOVES = 3;
  public boolean move() {
    Print.print("Checkers move " + moves);
    return ++moves != MOVES;
  }
}
 
//class CheckersFactory implements GameFactory {
//  public Game getGame() { return new Checkers(); }
//}	
 
class Chess implements Game {
  private int moves = 0;
  private static final int MOVES = 4;
  public boolean move() {
    System.out.println("Chess move " + moves);
    return ++moves != MOVES;
  }
}
 
//class ChessFactory implements GameFactory {
//  public Game getGame() { return new Chess(); }
//}	111
 
public class Games {
//  public static void playGame(GameFactory factory) {
	public static void playGame(Game game) {
//    Game s = factory.getGame();
    while(game.move())
      ;
  }
  public static void main(String[] args) {
    playGame(new Checkers());
    playGame(new Chess());
  }
}
