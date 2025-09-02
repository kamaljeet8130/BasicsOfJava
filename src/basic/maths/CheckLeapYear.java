package basic.maths;

import java.util.Scanner;

public class CheckLeapYear {
    public static boolean isLeapYear(int year){
        return year%4==0 && year%100!=0 || year%400 == 0;
    }
    static public void main(String... args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (isLeapYear(year))
            System.out.println(year + " year is a leap year");
        else
            System.out.println(year + " year is not a leap year");
    }
}
