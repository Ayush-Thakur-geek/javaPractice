package OOPS.Abstract;

public class Son extends parent{

    int age;
    public Son(int age) {
        super(age);
    }
    void normal() {
        super.normal();
    }
    @Override
    void career(String name) {
        System.out.println("I'm going to be the " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name);
    }
}
