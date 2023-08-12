package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        parent.hello();
        Son son = new Son(18);
        System.out.println(son.age);
        parent daughter = new Daughter(20);
        son.career("King");
        son.partner("my self", 0);
        daughter.career("Doctor");
        daughter.partner("xyz", 25);
    }
}
