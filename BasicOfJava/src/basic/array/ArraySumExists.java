package basic.array;

public class ArraySumExists {
    public static void main(String[] args) {
        int[] array = {4,5,2,4,8,9}; // need to sort them first !!!

        int targetValue = 11;
        boolean check = false;
        int ptrA = 0;
        int ptrB = array.length-1;
        while (ptrA<ptrB){
            int sum = array[ptrA] + array[ptrB];
            if (sum == targetValue){
                check = true;
                break;
            } else if (sum<targetValue)
                ptrA++;
            else
                ptrB--;


        }
        System.out.println(check);
    }


}
