package HeadFirstJava.chapter2Objectville.streamingsong;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
     StreamingSong streamingSong = new StreamingSong();
     streamingSong.title = " The Beatles";
     streamingSong.artist = " Arijit Singh";
     streamingSong.duration = 90;
     streamingSong.play();
     streamingSong.printDetails();
    }
}
