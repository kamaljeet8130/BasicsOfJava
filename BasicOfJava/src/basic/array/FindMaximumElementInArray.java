package basic.array;

public class FindMaximumElementInArray {
    public static void main(String[] args) {
        int[] array = {34,13,41,23,5132,123,34};
        System.out.println(findMaximun(array));
    }
    public static int findMaximun(int[] array){
        if (array==null || array.length==0){
            throw  new IllegalArgumentException("Array must not be empty");
        }
        int max = Integer.MIN_VALUE;
        for (int i =0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return  max;
    }
}
