package HeadFirstJava.chapter4howobjectsbehave.electricguitar;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }
    void setBrand(String abrand){
     brand = abrand;
    }
    int getNumOfPickups(){
        return numOfPickups;
    }
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    boolean isRockStarUsesIt(){
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }

}
