package Lesson7_Abstract_Class;

public class Dog extends Animal {
    @Override
    public void makeNoise(){
        System.out.println("Dog: Gau Gau");
    }
    public void chaseCat(){
        System.out.println("Dog is chasing a cat");
    }
}
