package HeadFirstJava.chapter2Objectville.guessingGame;



public class GameLauncher {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.number = 10;
        Player player2 = new Player();
        player2.number =20;
        GuessGame guessGame = new GuessGame();
        guessGame.startGame();


    }
}
