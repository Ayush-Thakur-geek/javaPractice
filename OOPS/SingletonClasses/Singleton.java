package OOPS.SingletonClasses;


public class Singleton {

    int a;
    private Singleton () {
        System.out.println("million");
    }

    private Singleton (int a) {
        this.a = a;
    }
    private static Singleton instance;
    public static int h() {
        return 90;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance = new Singleton(10);
    }
}
