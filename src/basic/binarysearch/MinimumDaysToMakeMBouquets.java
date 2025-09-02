package basic.binarysearch;

public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr= {1,2,5,9};
        int threshold =6;
        System.out.println(smallestDivisor(arr,threshold));
    }

    public  static int smallestDivisor(int[] nums, int threshold) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int ans = 0;
        for(int i : nums){
            start = Math.min(start,i);
            end = Math.max(end,i);
        }
        while (start<=end){
            int mid =start+(end-start)/2;
            int count = doSomething(nums,mid);
            if(count<=threshold){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static int doSomething(int[] nums,int mid){
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            count += (nums[i] + mid - 1) / mid;
        }
        return count;
    }
}
