//Write a program with two threads one thread should print even numbers from 1 to 10
//The other thread should print odd numbers from 1 to 9. Use the thread .close() method
//to space out the printing so you can then alternating.

class OddEvenThread {
    public static void main(String[] args) {

        System.out.println("The thread starts");

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("Odd " + i);

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Exception");
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even " + i);

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Exception");
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}