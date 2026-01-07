package Lesson6_Inheritance;

public class Dog extends Animal {
    // Overide
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

    // overload (method rieng cho dog)
    public void sound(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Dog barks");
        }
    }
}
