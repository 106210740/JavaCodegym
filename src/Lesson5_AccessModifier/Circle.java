package Lesson5_AccessModifier;

public class Circle {
    static final double PI = 3.14;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
}
