
public class Try {
        public static void main(String[] args) {
            int[] bloomDay = {1,10,3,10,2};
            int m = 3;
            int k = 2;
            System.out.println(minDays(bloomDay,m,k));


        }
    public static int minDays(int[] bloomDay, int m, int k) {
            if((long) m*k>bloomDay.length) return  -1;
            int start = findMin(bloomDay);
            int end = findMax(bloomDay);
            int ans = -1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(isFlowerBlooming(bloomDay,mid,m,k)){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    start= mid+1;
                }
            }
            return ans;
    }
    public static int findMin(int[] arr){
            int min = Integer.MAX_VALUE;
            for (int i =0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            return min;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
        public static boolean isFlowerBlooming(int[] arr, int mid , int m ,int k){
            int counter = 0;
            int bouquetCounter = 0;
            for(int i =0;i<arr.length;i++){
                if(arr[i]<=mid){
                    counter++;
                }
                else if(arr[i]>mid){
                    counter =0;
                }
                if(counter==k){
                    counter=0;
                    bouquetCounter++;
                }
            }
            return bouquetCounter >= m;
        }
    }

