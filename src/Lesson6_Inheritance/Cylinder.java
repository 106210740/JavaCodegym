package Lesson6_Inheritance;

public class Cylinder extends Circle2 {
    private double height;

    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "The cylinder with radius " + getRadius() +  ", and height " + getHeight() + " has volume " + getVolume()  ;
    }
}
