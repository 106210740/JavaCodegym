package Lesson1_IntroToJava;

import java.util.Scanner;

public class EnterYourName {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
