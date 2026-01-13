package Lesson7_Interface;

public class Main {
    public static void main(String[] args) {
//        Duck duck = new Duck();
//        duck.fly();
//        duck.swim();
//
//        Cat cat = new Cat();
//        cat.eat();
//        cat.run();
//
//        Flyable Donald = new Duck();
//        Donald.fly();
//        // Ép kiểu tường minh về Duck

        Flyable duck = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Duck is flying");
            }
        };
        duck.fly();
    }
}
