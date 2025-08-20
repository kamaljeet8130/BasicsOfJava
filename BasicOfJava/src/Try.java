
public class Try {
    public static void main(String[] args) {
       int n = 1714636915;
        System.out.println( arrangeCoins(n));
    }

        public static int arrangeCoins(int n) {
            int start = 1;
            int end = n;
            int ans = 0;
            while(start<=end){
                int mid =  start  + (end-start)/2;
                long midStairs = (long)(mid * ( mid+1 ))/2;
                if(midStairs ==n){
                    return mid;
                }
                else if(midStairs<n){
                    ans = mid;
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return ans;
        }
    }
