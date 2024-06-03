package HeadFirstJava.chapter2Objectville.drumkit;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        if(d.snare){
            d.playSnare();
        }
        d.playSnare();
        d.playTopHat();


    }
}
