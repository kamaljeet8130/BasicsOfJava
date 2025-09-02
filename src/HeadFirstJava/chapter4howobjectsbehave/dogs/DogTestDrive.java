package HeadFirstJava.chapter4howobjectsbehave.dogs;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rock");
        dog.setSize(50);  //Argument
        dog.bark(3);

        Dog dog1 = new Dog();
        dog1.setName("puchkin");
        dog1.setSize(1);
        dog1.bark(2);

    }
}
