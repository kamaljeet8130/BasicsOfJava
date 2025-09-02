package basic.maths;

public class PairSum {
    public static void main(String[] args) {
        int count = 0;
        int sum = 7;
        int[] arr = {2,8, 10, 5 ,-2, 5};
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
