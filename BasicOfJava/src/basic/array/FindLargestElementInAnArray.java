package basic.array;

public class FindLargestElementInAnArray {
    public static void main(String[] args) {
        int[] array = {10,20,80,30,60};
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0;i<array.length;i++){
            if (array[i]>largestElement){
                largestElement = array[i];
            }
        }
        System.out.println(largestElement);


    }
}
