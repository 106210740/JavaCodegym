package Lesson6_Inheritance;
// Overide , Son
public class Student extends Person {
    protected String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
