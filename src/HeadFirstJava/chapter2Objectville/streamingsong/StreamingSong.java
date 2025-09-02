package HeadFirstJava.chapter2Objectville.streamingsong;

public class StreamingSong {
    String title;
    String artist;
    int duration;
    void play(){
        System.out.println("playing song");
    }
    void printDetails(){
        System.out.println( title + " by " + artist);
    }
}
