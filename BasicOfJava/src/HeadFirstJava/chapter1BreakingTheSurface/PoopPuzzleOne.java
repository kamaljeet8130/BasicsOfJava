package HeadFirstJava.chapter1BreakingTheSurface;

public class PoopPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while(x<1){
            System.out.print("a");
            if(x<1){
                System.out.print("noise");
            }
            System.out.print("annoys");
            if(x<1){
                System.out.println("an");
                x=x+1;
            }
            if(x==1){
                System.out.print(" ");
            }
            if(x>0){
                System.out.print("oyster");
            }
            System.out.println();
            x=x+1;


            System.out.println();
            x=x+1;

        }
    }
}
