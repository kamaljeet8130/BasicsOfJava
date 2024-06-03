package HeadFirstJava.chapter2Objectville.shapes;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.playSound();
        triangle.rotate();
        Square square = new Square();
        square.playSound();
        square.rotate();
        Circle circle = new Circle();
        circle.playSound();
        circle.rotate();
        Amoeba amoeba = new Amoeba();
        amoeba.playSound();
        amoeba.rotate();

    }
}
