package OOPS.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ayush = new Student(5, 80f);
        Student xyz = new Student(7, 90.2f);
        Student df = new Student(4, 80.112f);
        Student erwe = new Student(6, 97.2f);

        Student[] list = {ayush, xyz, df, erwe};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//
//                return (int) (o1.marks - o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> (int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
//        if (xyz.compareTo(ayush) > 0) {
//            System.out.println("xyz has more marks");
//        }
    }
}
