package OOPS.WrapperClasses;

public class Example {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a + " " + b);
    }
    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
