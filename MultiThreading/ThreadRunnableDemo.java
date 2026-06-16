class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread is: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyRunnable Thread is: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
    }
}

public class ThreadRunnableDemo {
    public static void main(String[] args) {

        System.out.println("Main Thread start");

        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The main Thread ends");
    }
}