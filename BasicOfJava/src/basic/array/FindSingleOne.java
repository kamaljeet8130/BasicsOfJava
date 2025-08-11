package basic.array;

public class FindSingleOne {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.print(findSingleOne(arr));

    }
    public static int findSingleOne(int[] arr){
        int ans  = 0;
        for (int i : arr){
            ans^= i;
        }
        return ans;
    }

}
