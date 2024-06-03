package HeadFirstJava.chapter2Objectville.guessingGame;

public class GuessGame {
Player p1;
Player p2;
Player p3;
public void startGame(){
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessPlayer1 = 0;
    int guessPlayer2 = 0;
    int guessPlayer3 =0;

    boolean player1IsRight = false;
    boolean player2IsRight = false;
    boolean player3IsRight = false;

    int targetNumber = (int)(Math.random()*10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    while (true){
        System.out.println("Number to guess is : " + targetNumber);
        p1.guess();
        p2.guess();
        p3.guess();

        guessPlayer1 = p1.number;
        System.out.println("Player one guessed " + guessPlayer1);

        guessPlayer2 = p2.number;
        System.out.println("Player two guessed " + guessPlayer2);

        guessPlayer3 = p3.number;
        System.out.println("player three guessed " + guessPlayer3);

        if(guessPlayer1 == targetNumber){
            player1IsRight = true;
        }
        if(guessPlayer2 == targetNumber){
            player2IsRight = true;
        }
        if (guessPlayer3==targetNumber){

            player3IsRight =true;
        }
        if(player1IsRight|| player2IsRight|| player3IsRight){
            System.out.println("we have a winner");
            System.out.println("player one got it right? " + player1IsRight);
            System.out.println("player two got it right? " + player2IsRight);
            System.out.println("player three got it right? " + player3IsRight);
            break;
        }
        else {
            System.out.println("player will have to try again. ");
        }


    }


}
}
