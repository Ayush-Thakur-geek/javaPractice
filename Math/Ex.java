package Math;
import OOPS.AccessModifiers.A;

public class Ex extends A {

    public Ex (int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Ex obj = new Ex(4, "Ayush Thakur");
        System.out.println(obj.num);
    }
}
