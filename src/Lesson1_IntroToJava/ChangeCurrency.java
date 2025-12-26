package Lesson1_IntroToJava;

import java.util.Scanner;

public class ChangeCurrency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        System.out.println("Enter the value of usd: ");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double dollar = usd * vnd;
        System.out.println("The vallue of usd to vnd is: " + dollar);

    }
}
