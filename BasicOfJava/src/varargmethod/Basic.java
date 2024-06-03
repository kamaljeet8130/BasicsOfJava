package varargmethod;

public class Basic {
//    public static void m1(int...x){
//        System.out.println("Hello world");
//    }
//    public static void sum(int... x){
//        int sum = 0;
//        for (int s : x){
//            sum = sum+s;
//        }
//        System.out.println(sum);
//    }
//
//    public static void  sum(int[] x){
//        System.out.println(x);
//    } cannot declare both sum(int[]) and sum(int ...) in varargmethod.Basic
//    public static void m1(int ...x){
//        System.out.println("var-arg-method");
//    }
//    public static void m1(int x){
//        System.out.println("normal method");
//    }
//    public static void m1(int[]... a){
//        for (int[] x1:a){
//            System.out.println(x1);
//        }
//    }
//    public static void method(String... args){
//        for (String arg : args){
//            System.out.println(arg);
//        }
//    }
//
//    public static void main(String[] args) {
//        m1(1);
//        m1(1,2,2);
//        m1();
//        sum(10,20);
//        sum(10,20,30);
//        sum();
//        m1();
//        m1(10);
//
//        int[] a = {10,20,30};
//        int[] b = {40,50,60};
//        m1(a,b);
//        method("Hello","world");
//
//    }
    static public void main(String[] args){
        int x = 4;
        int y = 5;
        double d =(double) y/x;
        System.out.println(Math.round(d*(Math.pow(10,1))/Math.pow(10,1)));
    }
}
