package Lesson6_Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d1 = new Dog();
        Dog d2 = new Dog();

        System.out.println("=== Animal ===");
        a.sound();
        a.sound("happy");

        System.out.println("\n=== Dog via Animal reference ===");
        d1.sound();

        System.out.println("\n=== Dog ===");
        d2.sound();
        d2.sound(3);
        d2.sound("excited"); // gọi overload từ Animal
    }
}
