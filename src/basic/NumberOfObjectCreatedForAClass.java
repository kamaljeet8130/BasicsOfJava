package basic;

public class NumberOfObjectCreatedForAClass {
    static int count = 0;
    {
        count++;
    }

    public static void main(String[] args) {
        NumberOfObjectCreatedForAClass object1 = new NumberOfObjectCreatedForAClass();
        NumberOfObjectCreatedForAClass object2 = new NumberOfObjectCreatedForAClass();
        NumberOfObjectCreatedForAClass object3 = new NumberOfObjectCreatedForAClass();
        System.out.println(count);
    }
}
