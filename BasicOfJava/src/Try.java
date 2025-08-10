import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr=  {1,0,0,2,3};
//        1,0,2,3,0,4,5,0
        for(int i = 0;i<arr.length;i++){
            if( arr[i] == 0) {
                for(int j = arr.length-1;j>i;j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }


        for (int i : arr){
            System.out.print(i+",");
        }
    }
}