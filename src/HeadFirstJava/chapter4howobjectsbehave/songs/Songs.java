package HeadFirstJava.chapter4howobjectsbehave.songs;

public class Songs {
    String title;
    String artist;

    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void play(){
        System.out.println(title + " by : " + artist);
    }
}
