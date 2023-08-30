package OOPS.ObjectCloning;

public class Human implements Cloneable {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human(Human twin) {
        this.age = twin.age;
        this.name = twin.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
