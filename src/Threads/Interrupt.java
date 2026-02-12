package Threads;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Sleeping...");
//            Thread.sleep(5000);
            System.out.println("Woke up normally");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } {
            System.out.println("Woke up due to interrupt");
        }
    }
}

public class Interrupt {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();


        Thread.sleep(1000);
        t.interrupt();
    }
}
