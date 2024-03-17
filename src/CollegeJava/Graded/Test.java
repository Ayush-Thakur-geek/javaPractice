package CollegeJava.Graded;

public interface Test {
    static int a = 3;
    final int c = 2;
    int b = 3;
    public static void ten() {
        System.out.println(a+b);
    }
}

class hello implements Test {
    public static void main(String[] args) {
        Test.ten();
    }
}