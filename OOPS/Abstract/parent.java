package OOPS.Abstract;

abstract public class parent {
    int age;
//    parent b;
    public parent(int age) {
        this.age = age;
    }
    void normal() {
        System.out.println("normal");
    }
    static void hello() {
        System.out.println("hey");
    }
    abstract void career(String name);
    abstract void partner(String name, int age);
}
