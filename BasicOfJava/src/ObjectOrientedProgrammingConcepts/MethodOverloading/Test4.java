package ObjectOrientedProgrammingConcepts.MethodOverloading;

//class X{
//    int method(int i ,int d){
//        System.out.println("method int i ,int d");
//        return i+d;
//
//    }
//    static int method(int i ,double d){
//        System.out.println("method int ,double d");
//        return (int)(i+d);
//    }
//    double method (double i,int d){
//        System.out.println("method dobule i ,int d");
//        return i+d;
//    }
//    static double method(double i,double d){
//        System.out.println("method double i,double d");
//        return i+d;
//    }
//}
//
//public class Test4 {
//    public static void main(String[] args) {
//        X x = new X();
//        x.method(10.5,10.5);
//        x.method(10.5f,10.5f);
//        x.method('c','c');
//    }
//}