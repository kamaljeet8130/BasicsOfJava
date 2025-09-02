package threadexample;

public class ThreadExample4 implements Runnable {
    @Override
    public void run() {
        System.out.println("child Thread Implementation");
    }
    private static class ThreadDemo{
        public static void main(String[] args) {
            ThreadExample4 threadExample4 = new ThreadExample4();
            Thread thread = new Thread(threadExample4);
            thread.start();
            for (int i = 0;i<10;i++){
                System.out.println("main thread");
            }
        }
    }
}
