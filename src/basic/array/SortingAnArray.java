package basic.array;

public class SortingAnArray {
    public static int minimumElementOfArray(int[] array){
        int min = array[0];
        int i =0;
        while (i<=array.length-1){
            if (min>array[i])
                min = array[i];
            i++;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 10, 1, 12,-1,-19};
        System.out.println(minimumElementOfArray(array));


    }



}

