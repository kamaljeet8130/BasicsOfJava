package basic.binarysearch;

public class FindOutHowManyTimesArrayHasBeenRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(numberOfTimesArrarRotated(arr));
    }
    public static int numberOfTimesArrarRotated(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <end){
            int mid = start  + (end-start)/2;
            if(arr[mid]>arr[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}

