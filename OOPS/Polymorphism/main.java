package OOPS.Polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square sq = new Square();

        s.area();

        c.area();

        t.area();

        sq.area();
    }
}
