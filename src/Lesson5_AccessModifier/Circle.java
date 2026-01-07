package Lesson5_AccessModifier;

//public class Circle {
//    static final double PI = 3.14;
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return PI * radius * radius;
//    }
//}

//public class Circle {
//    private double radius = 1.0;
//    private String color = "red";
//}
//public Circle() {
//
//}
//public Circle(double radius){
//    this.radius = radius;
//}
//public double getRadius() {
//    return radius;
//}
//public double getArea() {
//    return Math.PI * radius * radius;
//}

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
