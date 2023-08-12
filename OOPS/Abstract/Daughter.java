package OOPS.Abstract;

public class Daughter extends parent {

    public Daughter(int age) {
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("I'm going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and he is " + age + " years old.");
    }
}
