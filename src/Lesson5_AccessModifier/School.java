package Lesson5_AccessModifier;

public class School {
    int rollno;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    School(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
