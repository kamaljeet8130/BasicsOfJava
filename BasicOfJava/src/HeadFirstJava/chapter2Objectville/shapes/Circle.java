package HeadFirstJava.chapter2Objectville.shapes;

public class Circle extends Shapes{
    @Override
    public void rotate() {
        System.out.println("rotate circle 360 degree from center");
    }

    @Override
    public void playSound() {
        System.out.println("play sound for Circle");
    }
}

