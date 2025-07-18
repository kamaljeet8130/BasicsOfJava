package basic.maths;

public class DisplayAlphabets {
    public static void printAlphabets(){
        for (char ch = 65;ch<=90;ch++)
            System.out.print(ch+" ,");
    }

    public static void main(String[] args) {
        printAlphabets();
    }
}
