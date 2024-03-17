package EndSem;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getId() + " " + i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i%2 != 0) {
                System.out.println(Thread.currentThread().getId() + " " + i);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
