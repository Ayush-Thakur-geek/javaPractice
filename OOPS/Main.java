package OOPS;

public class Main {
    public static void main(String[] args) {
        human ayush = new human(18, "Ayush Thakur", 3000000, false);
        human rajesh = new human(22, "Rajesh", 30000, true);
        System.out.println(human.population);
//        greeting();
        Main v = new Main();
        v.fun2();
    }

    // this isn't dependent on object.
    static void fun() {
        Main obj = new Main();
        obj.greeting(); // you can't use this because it requires an instance.
        // but the function you are  using, it doesn't depend on instances.
    }
    void fun2() {
        greeting();
    }

    //we know that something that isn't static, belongs to an object.
    void greeting() {
        fun();
        System.out.println("Hello world");
    }
}
