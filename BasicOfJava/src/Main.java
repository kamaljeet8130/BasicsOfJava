public class Main{
    static void deleteElement(int arr[],int pos){
        if(pos == arr.length-1)
            arr[arr.length-1] = 0;
        for (int i = pos;i<arr.length-1;i++){
            arr[i] = arr[i+1];
            arr[i+1] = 0;
        }
        for (int ar : arr){
            System.out.print(ar + " ");
        }
    }
    public static void main(String[] args) {
        deleteElement(new int[]{2,8,4,3,18},4);
    }
}