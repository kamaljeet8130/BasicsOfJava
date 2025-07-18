package basic.array;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] array1 = {2 ,1 ,2 ,2};
        int[] array2= {2,2, 2, 2};
        int count =0;
        for (int i =0;i<array1.length;i++){
            for (int j = 0;j<array2.length;j++){
//                System.out.print(array1[i] + ".... " + array2[j]+" ");
                if (array1[i]==array2[j]){
                    if (array1[i]==array2[j])
                    System.out.print(array2[j]+ " ");
                    array2[j] = Integer.MIN_VALUE;
                    break;

                }
            }
//            System.out.println();
        }

    }

}


//2
//4
//2 ,1 ,2 ,2
//4
//2,2, 2, 2
//4
//1 ,2 ,3 ,4
//5
//1, 1, 1 ,1, 1