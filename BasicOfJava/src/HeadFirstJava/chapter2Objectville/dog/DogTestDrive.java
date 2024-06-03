package HeadFirstJava.chapter2Objectville.dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Oreo";
        dog.size = 40;
        dog.breed = "bullDog";
        dog.bark();
        Dog dog1 = new Dog();
        dog1.name = "turtle";
        dog1.size = 30;
        dog1.breed = "american Fox";
        dog1.bark();
    }
}
