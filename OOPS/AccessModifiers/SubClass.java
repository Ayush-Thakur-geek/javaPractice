package OOPS.AccessModifiers;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Ayush Thakur");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}
