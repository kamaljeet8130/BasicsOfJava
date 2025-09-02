package basic.array;

public class SumOfAllElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfAnArray(arr));
    }
    public static int sumOfAnArray(int[] arr){
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

}
