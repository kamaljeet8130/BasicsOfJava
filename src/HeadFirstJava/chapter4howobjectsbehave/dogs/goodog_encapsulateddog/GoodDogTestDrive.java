package HeadFirstJava.chapter4howobjectsbehave.dogs.goodog_encapsulateddog;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one= new GoodDog();
        one.setSize(10);
        GoodDog two = new GoodDog();
        two.setSize(40);
        System.out.println("Dog one : " + one.getSize());
        System.out.println("Dog two : " + two.getSize());
        one.bark();
        two.bark();
    }
}
