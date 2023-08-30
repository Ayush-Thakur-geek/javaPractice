package OOPS.ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ayush = new Human(18, "Ayush Thakur");
//        Human twin = new Human(ayush);

        Human twin = (Human) ayush.clone();

        System.out.println(twin.name);
    }
}
