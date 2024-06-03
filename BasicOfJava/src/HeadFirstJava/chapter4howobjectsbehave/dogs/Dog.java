package HeadFirstJava.chapter4howobjectsbehave.dogs;

public class Dog {
   private String name;
    private int size;

    void setName(String name){
        this.name = name;
    }
    void setSize(int size){
        this.size = size;
    }
    void bark(int numberOfTimeBarks){   // parameter
        for (int i = 0;i<numberOfTimeBarks;i++){
            if(size>60){
                System.out.println("woof! woof!");
            }
            else if(size>30){
                System.out.println("Ruff Ruff");
            }
            else
                System.out.println("Yip Yip");
        }

    }
}
