package OopPractice;

public class Student {
    String name;
    int age;
    double gpa;

    // constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    boolean isExcellent(){
        return gpa >=3.5;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Ranking: " + getRank());
        System.out.println("----------------");
    }
    String getRank(){
        if (gpa >= 3.5){
            return "Excellent";
        } else if(gpa >= 3.0){
            return "Good";
        } else if(gpa >= 2.0){
            return "Average";
        } else{
            return "Weak";
        }
    }
}
