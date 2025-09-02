package HeadFirstJava.chapter4howobjectsbehave.dogs.goodog_encapsulateddog;

public class GoodDog {
    private  int size;
    public void setSize(int s){
        size = s;
    }
    public int getSize(){
        return size;
    }
    void bark(){
        if (size>60){
            System.out.println("Woof Woof");
        }
        else if (size>30){
            System.out.println("Ruff Ruff");
        }
        else
            System.out.println("Yip Yip");
    }
}
