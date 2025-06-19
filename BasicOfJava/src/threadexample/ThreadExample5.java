package threadexample;

public class ThreadExample5 extends Thread {
    @Override
    public void run() {
        System.out.println("child thread");


    }

    private static class ThreadDemo {
        public static void main(String[] args) {
            ThreadExample5 threadExample5 = new ThreadExample5();
            threadExample5.start();
            Thread.currentThread().setName("new nameThread");
            threadExample5.setName("thread number 1");
            System.out.println(Thread.currentThread().getName());
            System.out.println(threadExample5.getName());


        }
    }
}

