package OOPS;

public class Class {
    public static void main(String[] args) {
        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));
        Student Ayush = new Student(11, "Ayush Thakur", 99.9f);
        Student vella = new Student();
        Student random = new Student();
//        Ayush.name = "Ayush Thakur";
//        Ayush.rno = 7;
//        Ayush.marks = 99;
        Ayush.changeName("Rajput");
        Ayush.greeting();
//        System.out.println(random.rno);
//        System.out.println(random.marks);
//        System.out.println(random.name);
//        System.out.println();
//        System.out.println(Ayush.rno);
//        System.out.println(Ayush.marks);
//        System.out.println(Ayush.name);
//        Student one = new Student();
//        Student two = one;
//        one.name = "Vijay";
//        System.out.println(two.name);
//        one.name = "Ayush";
//        System.out.println(two.name);
    }
}
class Student {
    int rno;
    String name;
    float marks;
    void changeName(String newName) {
        name = newName;
    }
    void greeting() {
        System.out.println("Hello! My caste is " + name + ".");
    }
    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student() {
//        this.name = "Ayush Thakur";
//        this.rno = 7;
//        this.marks = 92.6f;
        this (19, "default", 65.2f);
    }
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}