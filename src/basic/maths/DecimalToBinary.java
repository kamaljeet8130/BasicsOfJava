package basic.maths;

public class DecimalToBinary {
    // this below logic is failed for large int number for example 78787 gives overflow value ::: either can convert this to long!!!
    public static int reverseOfANumber(int number){
        int reverseNumber = 0;
        int i =0;
        while (number!=0){
            int digit = number%10;
            reverseNumber = (digit*(int)Math.pow(10,i))+reverseNumber;
            i++;
            number/=10;
        }
        return reverseNumber;
    }
    public static int convertDecimalToBinary(int number){
        int newNumber = 0;
        int binaryNumber =0;
        int i =0;
        while (number>0){
            int remainder= number%2;
            number/=2;
            newNumber = (remainder*(int)Math.pow(10,i))+newNumber;
            i++;
            binaryNumber = reverseOfANumber(newNumber);
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
//        System.out.println(convertDecimalToBinary(78787));
        int number =78787;
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
        long answer =0;
        int i =0;
        while (number!=0){
           long bit = number&1;
            answer = (bit*(long)Math.pow(10,i)+answer);
            i++;

            number>>=1;
        }
        System.out.println(answer);
        //or//


    }
}



