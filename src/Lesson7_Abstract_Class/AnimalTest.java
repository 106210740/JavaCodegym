package Lesson7_Abstract_Class;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeNoise();
        a2.makeNoise();

        a1.sleep();
        a2.sleep();

        Dog d = (Dog) a1;
        d.chaseCat();
    }
}
