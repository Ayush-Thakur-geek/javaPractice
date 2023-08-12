package OOPS;

public class WrapperEx {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        Integer num = new Integer(45);
        System.out.println(num.hashCode());
//        Integer a = 10;
//        Integer b = 20;
//        swap(a,b);
//        System.out.println(a + " " + b);
//        final int a = 10;
//        System.out.println(a);

//        When a non primitive is final, you cannot reassign it.
        final A ayush = new A("Ayush Thakur");
        ayush.name="AT7";
        System.out.println(ayush.name);
        A obj = new A("hello");
        System.out.println(obj);
//        for (int i = 0; i < 10000000; i++) {
//            obj=new A("random");
//        }
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
