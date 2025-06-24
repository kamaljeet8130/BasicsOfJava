package basic.array;

public class SwapTwoNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for (int i : swap(arr,4,8)){
            System.out.print(i + ",");
        }

    }
    public static int[] swap(int[] arr ,int firstNumber,int secondNumber){
        if (firstNumber>arr.length || secondNumber>arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        int temp =arr[firstNumber];
        arr[firstNumber] =arr[secondNumber];
        arr[secondNumber] = temp;
        return arr;
    }
}
