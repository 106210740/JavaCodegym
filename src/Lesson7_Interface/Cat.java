package Lesson7_Interface;

public class Cat implements Runable, Eatable {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
