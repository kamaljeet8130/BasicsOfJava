package conditionalStatment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicsOfConditionalStatements {
    public static void printDaysNameCorrespondingtoNumber(int n){
        switch (n){
            case 1 :{
                System.out.println("mon");
                break;
            }
            case 2 : {
                System.out.println("tues");
                break;
            }
            case 3:{
                System.out.println("wed");
                break;
            }
            case 4:{
                System.out.println("thru");
                break;
            }
            case 5:{
                System.out.println("fri");
                break;
            }
            case 6:{
                System.out.println("sat");
                break;
            }
            case 7:{
                System.out.println("sun");
                break;
            }
            default:
                System.out.println("not a valid number");

        }
    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        printDaysNameCorrespondingtoNumber(n);

//        switch (n){
//            System.out.println("Hello");  // independent statment inside switch not allowed will give compile time error : case,default or } expected;
//        }

//        int x =10;
//        final  int y = 20;
//        switch (x){
//            case 10:
//                System.out.println("hi");
//                break;
//            case y:
//                System.out.println("Hello");
//                break;
//        }
//        int x = 10;
//        switch (x+1){
//            case 1:
//                System.out.println("hi");
//                break;
//            case 5+5+1:
//                System.out.println("Hello");
//                break;
//        }

//        byte b =10;
//        switch (b+1){
//            case 11:
//                System.out.println("hi");
//                break;
//            case 1000:
//                System.out.println("hwllo");
//                break;
//            case 97:
//                System.out.println("97");
//                break;
//            case 'a':
//                System.out.println('a');
//                break;
//        }

//        while (1==1){
//            System.out.println("Hello");
//        }

//        final int a = 10,b=20;
//        while (a<b){
//            System.out.println("Hello");
//        }
//        System.out.println("hi");
//
//        do while(true)
//            System.out.println("Hello");
//        while (false);
//        final int a = 10,b=20;
//        do{
//            System.out.println("Hello");
//        }while (a<b);
//        System.out.println("Hi");
//        for (int i = 0;true;i++){
//            System.out.println(i);
//        }

//        int i = 1;
//        for (System.out.println("Hello");i<=10;i++){
//            System.out.println("hi"+i);
//        }
//        for (int i = 0;i<3; System.out.println("hi")){
//            System.out.println('h');
//            i++;
//        }
//        final int a = 10,b=20;
//        for (int i = 0;a<b;i++){
//            System.out.println("hi");
//        }
//        System.out.println("hello");
//    }

    }

}
