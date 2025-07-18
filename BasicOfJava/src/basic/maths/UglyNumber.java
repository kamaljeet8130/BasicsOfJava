package basic.maths;

public class UglyNumber {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(uglyNumber(n));
    }
    public static  boolean uglyNumber(int n){
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                return false;
            }
        }
        return  true;
    }
}
