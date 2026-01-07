package Lesson5_AccessModifier;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        r1.setHeight(3);
        Rectangle r2 = new Rectangle();
        r2.setWidth(4);
        r2.setHeight(5);
        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());
        System.out.println("Rectangle 2 area: " + r2.getArea());
        System.out.println("Rectangle 2 perimeter: " + r2.getPerimeter());
    }
}
