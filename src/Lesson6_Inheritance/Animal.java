package Lesson6_Inheritance;

public class Animal {
    //method goc
    public void sound(){
        System.out.println("Animal makes a sound");
    }

    //overload
    public void sound(String mood){
        System.out.println("Animal sounds when " + mood);
    }

}
