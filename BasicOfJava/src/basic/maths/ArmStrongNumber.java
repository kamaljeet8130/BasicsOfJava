package basic.maths;

public class ArmStrongNumber {
    public static int digitCount(int number) {
        int digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    public static int powerOfANumberRaiseToN(int number, int raisingNumber) {
        int power = 1;
        for (int i = 1; i <= raisingNumber; i++) {
            power *= number;
        }
        return power;
    }

    public static int armStrongNumber(int number) {
        int newNumber = number;
        int armStrongNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            armStrongNumber = armStrongNumber + powerOfANumberRaiseToN(digit, digitCount(newNumber));
            number /= 10;
        }
        return armStrongNumber;
    }

    public static void main(String[] args) {
        int number = 1634;
        System.out.println(armStrongNumber(number));
        if (number == armStrongNumber(number))
            System.out.println("number is an armstrong Number");
        else
            System.out.println("Number is not an armstrong number");
    }

    public static class UniqueElementInAnArray {
        public static int uniqueElement(int[] array){
            for (int k : array) {
                int count = 0;
                for (int i : array) {
                    if (k == i) {
                        count++;
                    }
                }
                if (count == 1)
                    return k;

            }
            return -1;
        }
        public static void main(String[] args) {
            int[] array = {2,3,3,1,6,2,6};
            System.out.println(uniqueElement(array));

        }

    }
}