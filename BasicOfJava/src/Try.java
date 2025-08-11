import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        Arrays.sort(arr);
        System.out.println(findSingleOne(arr));
    }
    public static int findSingleOne(int[] arr){
        for (int i = 0;i<arr.length;i++){
            if(( (i!=arr.length-1) && (arr[i]^arr[i+1])==0) ){
                i++;
            }
            else {
                return arr[i];
            }
        }
        return  arr[arr.length-1];
    }
}