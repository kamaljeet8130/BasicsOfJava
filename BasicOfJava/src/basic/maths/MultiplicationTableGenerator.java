package basic.maths;

public class MultiplicationTableGenerator {
    public static void generateMultiplicationTable(int number){
        for (int i = 1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        generateMultiplicationTable(5);
    }
}
