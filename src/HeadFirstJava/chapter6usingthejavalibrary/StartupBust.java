package HeadFirstJava.chapter6usingthejavalibrary;

import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper;
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numOfGuesses;

    void setUpGame(){
        Startup one = new Startup();
        Startup two = new Startup();
        Startup three = new Startup();
        one.setName("zomato");
        two.setName("swiggy");
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);
        System.out.println("Your goal is to sink three Startups\n");
        System.out.println(one.getName()+ " , " + two.getName()+ " , " + three.getName()+"\n");
        System.out.println("Try to sink them all in the fewest number of guesses\n");
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();


    }
}