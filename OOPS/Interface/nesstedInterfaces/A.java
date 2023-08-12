package OOPS.Interface.nesstedInterfaces;

public class A {
    public interface Nested {
        boolean isOdd(int num);
    }
}
class B implements A.Nested {

    @Override
    public boolean isOdd(int num) {
        return ((num & 1) == 1);
    }
}
