package basic.array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        for (int i = 0;i<size;i++){
            for (int j = 0;j<size-1;j++){
                if (nums[i] == nums[j]){
                    nums[j] = nums[j+1];
                }
                size--;
            }
        }
        return  -1;
    }
}
