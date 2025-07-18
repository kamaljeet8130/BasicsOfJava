package basic.maths;

public class TripletSum {
    public static void main(String[] args) {
        int count =0;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i =0;i<=array.length-1;i++){
            for (int j = 1;j<=array.length-2;j++){
                for (int k = 2;k<=array.length-3;k++){
                    if (array[i]+array[j]+array[k]==12){
                        System.out.println(array[i]+"..."+array[j]+"..." +array[k]);
                        count++;
                    }
                }

            }

        }
        System.out.println(count);

    }
}
