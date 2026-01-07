package Lesson6_Inheritance;
//
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Tuan Anh", 18, "SV001");

        s.displayInfo();
        s.study();
        Person p = new Person("hh", 18);
        System.out.println(p);

    }
}