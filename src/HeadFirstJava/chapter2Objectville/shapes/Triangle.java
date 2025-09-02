package HeadFirstJava.chapter2Objectville.shapes;

public class Triangle extends Shapes{
   public void rotate(){
       System.out.println("rotate Triangle 360 degree from the center");
   }
   @Override
    public void playSound(){
       System.out.println("play sound for Triangle");
   }
}
