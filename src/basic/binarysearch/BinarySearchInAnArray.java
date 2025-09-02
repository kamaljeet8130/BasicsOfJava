package basic.binarysearch;

public class BinarySearchInAnArray {
    public static int binraySearch(int[] array,int requiredElement){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (array[mid]==requiredElement){
                return mid;
            }
            else if (array[mid]<requiredElement)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {12,10,15,32,35,40,45,60,43};  // array should be in sorted to use binary search:!!!
        int requiredElement = 43;
        System.out.println(binraySearch(array,requiredElement));

    }
}
