package HeadFirstJava.chapter1BreakingTheSurface;

public class BottleSong {
    public static void main(String[] args) {
        int bottleNum = 99;
        String word = "Bottles";

        while(bottleNum>0){
            if(bottleNum==1){
                word="Bottle";
            }
            System.out.println(bottleNum + " green " + word + " hanging on the wall");
            System.out.println(bottleNum + " green " + word + " hanging on the wall");
            System.out.println("And if One green bottle should accidentally fall");
            bottleNum-=1;
            if(bottleNum>0){
                System.out.println("There'll be " + bottleNum + " green " + word + " hanging on the wall");
            }
            else {
                System.out.println("there will be no green bottle hanging on the wall");
            }

        }
    }
}
