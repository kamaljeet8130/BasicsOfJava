package basic.array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,4,3,2,1,109,12};
        sort(arr,arr.length);
        for (int i : arr){
            System.out.print(i+",");
        }
    }
    public static void sort(int[] arr, int n){
        for (int i = 0;i<n;i++){
            int smallest = i;
            for (int j = i+1;j<n;j++){
                if (arr[j]<arr[smallest]){
                    smallest= j;
                }
            }
            swap(arr,i,smallest);
        }
    }
    public static void swap(int[] arr, int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
