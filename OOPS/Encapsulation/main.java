package OOPS.Encapsulation;

public class main {
    public static void main(String[] args) {
        Access obj = new Access(12, "Ayush Thakur");

        // need to do few things
        /*
         1. access the data members
         2. modify the data members
         */

        int n = obj.num;

        System.out.println(obj.getNum());

        obj.setNum(55);

        System.out.println(obj.getNum());
    }
}
