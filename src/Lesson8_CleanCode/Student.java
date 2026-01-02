package Lesson8_CleanCode;
// refactor: tách biến
public class Student {
    public static final int INT = 1;
    private int mathScore;
    private int physicsScore;
    private int chemistryScore;

    public double calculateGPA() {
        int totalScore = mathScore + physicsScore + chemistryScore;
        double averageScore = totalScore / 3.0;
        return averageScore;
    }

    public boolean isPassed() {
        return (mathScore + physicsScore + chemistryScore) / 3.0 >= 5.0;
    }
    public boolean isAdmin(int role){
        return role == INT;
    }
}