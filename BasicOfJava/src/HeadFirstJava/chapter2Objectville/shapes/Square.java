package HeadFirstJava.chapter2Objectville.shapes;

public class Square extends Shapes{
    @Override
    public void rotate() {
        System.out.println("roate Square 360 from center");
    }

    @Override
    public void playSound() {
        System.out.println("play sound for Square");
    }
}
