package Threads;

public class ThreadPriority {
    static void main(String[] args) throws InterruptedException {
        M obj1=new M();
        N obj2=new N();
        obj1.start();
        obj1.interrupt();


        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getState());



        obj2.start();


    }
}

class M extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 10 ; i++) {
            System.out.println("hi");
        }
    }
}
class N extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("hello");
        }
    }
}