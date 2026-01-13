package Lesson13_JavaCollectionFramework;

public class Student {
    String name;
    String id;
    double gpa;

    public Student() {}
    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
    }
}
