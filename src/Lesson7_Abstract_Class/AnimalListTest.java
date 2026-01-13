package Lesson7_Abstract_Class;

public class AnimalListTest
{
    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        list.add(new Dog());
        list.add(new Cat());

        list.makeAllNoise();
    }
}
