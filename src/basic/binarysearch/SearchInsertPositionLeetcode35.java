package basic.binarysearch;

public class SearchInsertPositionLeetcode35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        //output = 1 ;
        System.out.print(searchInsert(nums,target));
    }

    public static  int searchInsert(int[] nums, int target) {
        int start = 0;
        int end  = nums.length-1;
        int ans = nums.length;
        while (start<=end){
            int mid = start+ (end-start)/2;
            if(nums[mid]>=target){
                ans  = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
