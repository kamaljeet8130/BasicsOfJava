package HeadFirstJava.chapter2Objectville.shapes;

public class Amoeba extends Shapes{
    @Override
    public void rotate() {
        System.out.println("rotate amoeba from the end point");
    }

    @Override
    public void playSound() {
        System.out.println("play mp3.amoeba");
    }
}
