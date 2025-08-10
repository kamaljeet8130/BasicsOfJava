package basic.array;

public class DeletingFromAnywhereInTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int index = 8;
        deletingFromAnywhereInTheArray(arr,index);

    }
    public  static void deletingFromAnywhereInTheArray(int [] arr, int index){
        for(int i = index;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        for (int i: arr){
            System.out.print(i + " ,");
        }
    }
}
