package HeadFirstJava.chapter1BreakingTheSurface;

public class Exercise1a {
    public static void main(String[] args) {
        int x =1;
        while(x<10){
            x=x+1;
            if(x>3){
                System.out.println("big x");
            }
        }
    }
}
