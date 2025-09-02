package basic.maths;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
//        int result = 0;
//        for(int digit : arr){
//            result = result * 10 + digit;
//        }
//        result+=1;
//        int count = digitCounter(result);
//        int[] array = new int[count];
//        for (int i =count-1;i>=0;i--){
//            while (result!=0){
//                int digit = result%10;
//                array[i] = digit;
//                result/=10;
//                break;
//            }
//        }
//        for (int i : array){
//            System.out.print(i + " ,");
//        }

        //this will not work if we get out of range value
        // ex: [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]
        int[] arr = {2,8,9};
        for (int i : plusOne(arr)){
            System.out.println(i);
        }
    }




    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int i = 0;
        for( i = size-1;i>=0;i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;

            }
        }
            if(i==-1){
                int[] newDigit = new int[size+1];
                newDigit[0]=1;
                return newDigit;
            }

        return digits;
    }
    //    public static int digitCounter(int number){
//        int count=0;
//        while (number!=0){
//            count++;
//            number/=10;
//        }
//        return count;
//    }
}
