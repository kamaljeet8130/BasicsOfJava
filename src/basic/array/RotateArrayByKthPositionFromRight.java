package basic.array;

public class RotateArrayByKthPositionFromRight {
    public static void main(String[] args) {

    }
    public static void reverse(int[] arr,int left,int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }
}
