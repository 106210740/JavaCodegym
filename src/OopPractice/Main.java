package OopPractice;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OopPractice");
        Student[] students = new Student[4];
        students [0] = new Student("Tuan Anh", 19, 3.6);
        students [1] = new Student("An", 18, 3.2);
        students [2] = new Student("Binh", 19, 3.8);
        students [3] = new Student("Bao", 19, 1.8);
        for (int i = 0; i<students.length; i++){
            students[i].displayInfo();
        }
        Student bestStudent = students[0];
        for (int i = 1; i<students.length; i++){
            if (students[i].gpa > bestStudent.gpa){
                bestStudent = students[i];
            }
            System.out.println("Student with the highest GPA: ");
            bestStudent.displayInfo();
        }
    }
}
