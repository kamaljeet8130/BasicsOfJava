package ObjectOrientedProgrammingConcepts.MethodOverloading;

//package ObjectOrientedProgrammingConcepts.MethodOverloading;
////package ObjectOrientedProgrammingConcepts.MethodOverloading;
//
////
////class X{
////    void calculated(int a ,int b){
////        System.out.println("Class X");
////    }
////}
////class Y extends X{
////    @Override
////        void calculated(int a,int b){
////        System.out.println("Class Y");
////    }
////}
////class Z extends Y{
////    @Override
////        void calculated(int a,int b){
////        System.out.println("Class Z");
////    }
////}
////public class Test7 {
////    public static void main(String[] args) {
////        X x = new Y();
////        Y y = (Y) x;
////    }
////}
//
////class P{
////    public void m1(int ... x){
////        System.out.println("Parents");
////    }
////}
////class Cc extends P{
////    public void m1(int x) {
////        System.out.println("child");
////    }
////}
////class Test7{
////    public static void main(String[] args) {
////        P p = new P();
////        p.m1(10);
////        Cc c = new Cc();
////        c.m1(23);
////        P p1 = new Cc();
////        p1.m1(34);
////
////
//
//
//
////    }
////}
//
////class Parent{
////    int x = 999;
////}
////class Child extends Parent{
////    int x =1999;
////}
////class Test7 {
////    public static void main(String[] args) {
////        Parent p = new Parent();
////        Child c = new Child();
////        Parent p1 = new Child();
////        System.out.println(p.x);
////        System.out.println(c.x);
////        System.out.println(p1.x);
////    }
////
////}
//
////class Parent{
////    public void m1(String s){
////        System.out.println("String object");
////    }
////    public void m1(StringBuffer b){
////        System.out.println("object object");
////    }
////
////}
////public class Test7 {
////    public static void main(String[] args) {
////        Parent parent = new Parent();
////        parent.m1(null);
////
////
////
////    }
////}
//
//class Aa{
//    static  int i = Bb.j;
//
//}
//
//class Bb{
//    static int j = Cc.k;
//
//}
//class Cc {
//    static int k = Dd.m1();
//}
//class Dd{
//    public static int m1(){
//        return 10;
//    }
//}
//public class Test7 {
//    public static void main(String[] args) {
//        System.out.println(Aa.i);
//        System.out.println(Bb.j);
//        System.out.println(Cc.k);
//        System.out.println(Dd.m1());
//    }
//}
//class Aa{
////    public static void main(String[] args) {
////        Integer I = new Integer(10);
////        Number n = (Number) I;
////        Object o = (Object) n;
////
////        System.out.println(n + " " + I + " " + o);
////        System.out.println(I.getClass().getName());
////        System.out.println(n.getClass().getName());
////        System.out.println(o.getClass().getName());
//
//    }
//
//}

//class Parent{
//    public void m1(){
//
//    }
//}
//class child  extends Parent{
//    public void m2(){
//
//    }
//}
//
//public class Test7 {
//    public static void main(String[] args) {
//        child c = new child();
//        c.m2();
//        c.m1();
//        Parent p = (Parent)c;
//        p.m1();
//        p   .m2();
//    }
//}

class Aa{
    int x = 777;
}
class Bb extends Aa{
    int x = 888;
}
class Cc extends Bb{
    int x = 999;
}
public class Test7 {
    public static void main(String[] args) {
        Cc cc = new Cc();
        System.out.println(cc.x);
        System.out.println(((Bb)cc).x);
        System.out.println(((Aa)((Bb)cc)).x);

    }
}