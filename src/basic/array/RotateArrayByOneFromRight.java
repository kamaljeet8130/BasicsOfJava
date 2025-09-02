package basic.array;

public class RotateArrayByOneFromRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 1;
        //after 1 rotation : arr [8,1,2,3,4,5,6,7];
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for (int i : arr){
            System.out.print(i + ",");
        }
    }
    public static void reverse(int[] arr,int left,int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
