package Threads;

public class ConversionInterfaceCodeToLamda {
    static void main(String[] args) {
        Runnable o1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };

        Runnable o2=new B();

        Thread t1=new Thread(o1);
        Thread t2= new Thread(o2);

        t1.start();
        t2.start();

    }
}




class B implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}