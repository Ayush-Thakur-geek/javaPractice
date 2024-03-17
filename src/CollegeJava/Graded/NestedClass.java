package CollegeJava.Graded;

public class NestedClass {
    void hello() {
        System.out.println("hello");
    }
}

class Rest extends NestedClass {
    void hello() {
        super.hello();
    }

    public static void main(String[] args) {
        Rest r = new Rest();
        r.hello();
    }
}