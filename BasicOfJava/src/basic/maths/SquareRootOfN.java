package basic.maths;

public class SquareRootOfN {
    public static void main(String[] args) {
        System.out.println(mySqrt(214729647));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans  = 0;
        if(x==0 || x ==1){
            return x;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid == x){
                return  mid;
            }
            else if(mid*mid<x){
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return  ans;
    }

}
