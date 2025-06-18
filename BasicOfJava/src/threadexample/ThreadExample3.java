package threadexample;

public class ThreadExample3 extends Thread {
    @Override
    public void run() {
        System.out.println("run method");
    }
    public static class ThreadDemo{
        public static void main(String[] args) {
            ThreadExample3 threadExample3 = new ThreadExample3();
            threadExample3.start();
            System.out.println("thread Started");
            threadExample3.start();
        }
    }
}

