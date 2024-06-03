package HeadFirstJava.chapter2Objectville.episode;

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 1;
        episode.play();
        episode.skipIntro();
    }
}
