package Lesson6_Inheritance;

public class Circle2 {
    private double radius;
    private String color;
    public Circle2() {
        radius = 1.0;
        color = "blue";
    }
    public Circle2(double radius) {
        this.radius = radius;
    }
    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A circle with radius " + radius + ", and color " + color + "." + " The area of this circle is " + getArea();
    }
}
