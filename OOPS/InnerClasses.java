package OOPS;

public class InnerClasses {

    static class Test {
        String name = "Ayush Thakur";

        public Test(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

    }


    public static void main(String[] args) {
        Test a = new Test("Ayush Thakur");
        Test b = new Test("Rahul");
//        System.out.println(a);
//        System.out.println(b.name);
        System.out.println(a);
    }
}
