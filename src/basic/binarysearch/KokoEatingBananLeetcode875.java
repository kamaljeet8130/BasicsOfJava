package basic.binarysearch;

public class KokoEatingBananLeetcode875 {
    public static void main(String[] args) {
        int[] arr ={805306368,805306368,805306368};
        int hours = 1000000000;
        System.out.println(hoursNeeded(arr,hours));
    }
    public static int hoursNeeded(int[] arr,int hours){
        int start = 1;
        int end = maxBananaInAPile(arr);
        int k = -1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (bananaPerHourInMidSpeed(arr,mid)<=hours){
                k = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return k;
    }
    public static int maxBananaInAPile(int[] arr){
        int maxBanana=Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>maxBanana){
                maxBanana = arr[i];
            }

        }
        return maxBanana;
    }
    public static int bananaPerHourInMidSpeed(int[] arr ,int mid){
        int hours = 0;
        for (int i = 0;i<arr.length;i++){
            hours += (arr[i] + mid - 1) / mid;
        }
        return hours;
    }
}
