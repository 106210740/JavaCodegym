package Lesson5_AccessModifier;

public class Person {
    private String name;
    private int rollno;
    private static String college = "BBDOT";

    Person(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(){
        college = "Codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
