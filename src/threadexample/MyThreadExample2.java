package threadexample;

public class MyThreadExample2 extends Thread {
    @Override
    public void start() {
        super.start();
        System.out.println("Start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }

    private static class MyThread {
        public static void main(String[] args) {
            MyThreadExample2 threadExample2 = new MyThreadExample2();
            threadExample2.start();
            System.out.println("main method");
        }
    }
}
