package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Thread1 t1 = new Thread1("thread1");
//        t1.setDaemon(true);
        Thread t2 = new Thread(()->{
            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "thread2");
        t1.start();
        t2.start();
        System.out.println("Main is exiting");
    }
}
