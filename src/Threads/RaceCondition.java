package Threads;

class C{
    int count=0;
    public synchronized void incrementt(){
        count++;
    }
}

public class RaceCondition {
    static void main(String[] args) throws InterruptedException {
        C obj=new C();
        Runnable o1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    obj.incrementt();
                }
            }
        };

        Runnable o2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    obj.incrementt();
                }
            }
        };

        Thread t1=new Thread(o1);
        Thread t2= new Thread(o2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);

    }
}


