package HeadFirstJava.chapter2Objectville.episode;

public class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro(){
        System.out.println("Skipping Intro");
    }
    void skipToNext(){
        System.out.println("Loading next episode");
    }
    void play(){
        System.out.println("Playing Episode of series Number " + seriesNumber + " Episode Number: " + episodeNumber);
    }
}
