package basic.binarysearch;

public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 8, 10};
        int n=6; int x=5;
        for (int i : getFloorAndCeil(arr,n,x)){
            System.out.print(i + ", ");
        }
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] arr = new int[2];
        int start = 0;
        int end = n-1;
        int floor = -1;
        int ceil = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(a[mid] == x){
                floor = ceil = a[mid];
                break;
            }
            else if (a[mid] > x) {
                floor = a[mid];
                end  = mid - 1;
            } else {
                ceil = a[mid];
                start = mid +1;
            }
        }
        arr[1] = floor;
        arr[0] = ceil;
        return arr;
    }
}
