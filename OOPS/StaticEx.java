package OOPS;

public class StaticEx {
    static int a = 4;
    static int b;

    // will run only once, when the first obj is created i.e. when the class is overlooked.
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticEx obj = new StaticEx();
        System.out.println(StaticEx.a + " " + StaticEx.b);

        StaticEx.b += 3;
        StaticEx obj2 = new StaticEx();
        System.out.println(StaticEx.a + " " + StaticEx.b);
    }
}
