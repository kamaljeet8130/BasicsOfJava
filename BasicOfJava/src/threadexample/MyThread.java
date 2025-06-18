package threadexample;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello world");
    }

    private static class ThreadDemo {
        public static void main(String[] args) {
            MyThread thread = new MyThread();
            thread.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from main thread");
            }

        }
    }
}
