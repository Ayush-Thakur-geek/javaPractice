package OOPS.Interface.ExtendingInterfaces;

public class Main implements B{
    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
