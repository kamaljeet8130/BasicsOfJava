package ObjectOrientedProgrammingConcepts.MethodOverloading;

public class Test2 {
    public void m1(){
        System.out.println("without static");
    }
    public static  void m1(String s){
        System.out.println("with static");
    }

}
class Test{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.m1();
        test2.m1("hello");
    }
}