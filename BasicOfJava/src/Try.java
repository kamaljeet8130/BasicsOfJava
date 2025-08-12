import java.util.ArrayList;
import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr ={1,2,2,4,4,4,4,4,4,4,4};
        for (int i : firstAndLastOccurence(arr,4)){
            System.out.print(i+",");
        }
    }
    public static int[] firstAndLastOccurence(int[]  nums, int target){
        int[] arr =new int[2];
        int first = -1;
        int last = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first = i;
                }
                last = i;
            }

        }
        arr[0] = first;
        arr[1] = last;
        return arr;
    }

}