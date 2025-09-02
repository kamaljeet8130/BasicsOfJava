package basic.array;

public class subArrayOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subArray(arr);

    }
    public static void subArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

//1
//12
//123
//1234
//12345
//
//2
//23
//234
//2345
//
//3
//34
//345
//
//4
//45
//
//5
