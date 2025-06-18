package basic.array;

public class ReverseOfArray {
    public static void main(String[] args) {
         int[] arr = {10,20,30,40,50,30,1230,213,12,41};
         for(int i :arrayReverse(arr)){
             System.out.println(i);
         }

    }
    public static int[] arrayReverse(int[] array){
        for (int i = 0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = temp;
        }
        return  array;
    }
}
