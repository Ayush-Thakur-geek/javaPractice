package OOPS.Comparator;

public class Student implements Comparable<Student> {
    int roll;
    float marks;
    Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public String toString() {

        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("check");
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
