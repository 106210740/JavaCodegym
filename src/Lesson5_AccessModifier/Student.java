package Lesson5_AccessModifier;
//
//public class School {
//    private String name;
//    private int age;
//    public Student(String name, int age) {
//        this.name = name;
//        setAge(age);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        if (age > 0){
//            this.age = age;
//        }
//    }
//}

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student() {}

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
    }
}
