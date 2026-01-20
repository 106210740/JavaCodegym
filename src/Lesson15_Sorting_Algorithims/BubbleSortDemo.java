package Lesson15_Sorting_Algorithims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortDemo {
    public static void main(String[] args) {
//        int[] arr = { 5, 4, 3, 2, 1 };
        String [] students = {"John", "Alice" ,  "Bob" }; // array of strings
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Hang", 26));
        studentList.add(new Student("Thu", 23));
        studentList.add(new Student("WanBi", 30));
        studentList.add(new Student("Ngoc", 23));
        studentList.add(new Student("Khang", 23));

        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
        }

//        System.out.println("Mang ban dau chua sap xep");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Mang sau khi sap xep");
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
