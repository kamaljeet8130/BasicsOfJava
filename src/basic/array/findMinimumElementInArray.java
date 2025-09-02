package basic.array;

public class findMinimumElementInArray {
    public static void main(String[] args) {
        int[] array = {34,13,41,23,5132,123,34};
        System.out.println(findMinimum(array));

    }
    public  static  int findMinimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i =0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
