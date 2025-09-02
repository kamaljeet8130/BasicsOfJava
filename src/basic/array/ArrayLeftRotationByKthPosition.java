package basic.array;

public class ArrayLeftRotationByKthPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        for (int i :arr){
            System.out.print(i+",");
        }
    }
    public static void reverse(int[] arr,int left, int right){
        while (left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
