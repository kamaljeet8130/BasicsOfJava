package basic.binarysearch;

public class PivotElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(arr));
        System.out.println(pivotIndex2(arr));

    }
    public static int pivotIndex(int[] nums){
        for(int i  = 0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j =0;j<=i-1;j++){
                leftSum+=nums[j];
            }
            for (int k = i+1;k<nums.length;k++){
                rightSum+=nums[k];
            }
            if (leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
    public static int pivotIndex2(int[] nums){
        int totalSum = 0;
        for (int i = 0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int leftSum = 0;
        for (int i = 0;i<nums.length;i++){
            int rightSum = totalSum-leftSum-nums[i];
            if (rightSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
