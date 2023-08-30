package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            Main main = new Main();
            System.out.println(main.divide(a, b));
//            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("hello");
        }
    }
    int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please learn basics of math.");
        }
        return a/b;
    }
}
