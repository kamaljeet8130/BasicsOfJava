package HeadFirstJava.chapter2Objectville.movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.title = "tere naam";
        movieOne.genre = "Tragic";
        movieOne.rating = 4;
        Movie.playIt();

        Movie movieTwo = new Movie();
        movieTwo.title = "Avenger end game";
        movieTwo.genre= "superHeros";
        movieTwo.rating = 3;
        Movie.playIt();

        Movie movieThree = new Movie();
        movieThree.title = "Titanic";
        movieThree.genre="Romantic";
        movieThree.rating = 5;
        Movie.playIt();

    }
}
