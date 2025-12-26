package Lesson3_Array;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size:  ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student:  " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("List of mark: ");
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("Number of student passing the exam is: " + count);
    }

}
