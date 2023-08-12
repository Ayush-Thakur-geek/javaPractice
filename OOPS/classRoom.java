package OOPS;

public class classRoom {
    public static void main(String[] args) {
        Studentex student = new Studentex();
        student.age = 18;
        student.name = "Ayush Thakur";
        student.adress.city = "Chandigarh";
        student.adress.state = "U.T.";
        student.adress.country = "India";

        System.out.println(student);
    }
}
