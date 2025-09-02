package HeadFirstJava.chapter3knowyourvariable.dogs;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Neil";

        Dog[] dogs= new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dog1;
        dogs[0].name = "Fred";
        dogs[1].name = "Merge";

        System.out.print("last dog name is:  ");
        System.out.println(dogs[2].name);
        int i = 0;
        while(i<dogs.length){
            dogs[i].bark();
            i++;
        }
    }
}
