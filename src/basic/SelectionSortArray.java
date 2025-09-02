package basic;

import java.util.Arrays;

public class SelectionSortArray {
    public static int[] minimumValueFromArray(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i =0;i<=array.length-1;i++){
            if (array[i]<min){
                min =array[i];
            }
            else
                array[i] =min;
        }
        return array;

    }
    public static void main(String[] args) {
        int[] array ={7,2,9,6,1,5,4,-2343243};
        System.out.println(Arrays.toString(minimumValueFromArray(array)));

    }
}
