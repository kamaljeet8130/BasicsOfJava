package basic.array;

public class LinearSearchInAnArray {
    public static int linearSearch(int[] array,int requiredElement){
        for (int i=0;i<=array.length-1;i++){
            if (array[i] == requiredElement)
                return i;

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {32,532,13,543,13,123};
        int requireElement = 13;
        System.out.println(linearSearch(array,requireElement));
    }


}
