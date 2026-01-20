package Lesson10_DSA_3;
import java.util.ArrayList;

public class Demo_Array_List {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list);

        // access
//        ArrayList<String> names = new ArrayList<>();
//        names.add("gg");
//        names.add("h");
//        names.add("d");
//        System.out.println(names.get(1));
//
//        // remove
//        names.remove("h");
//        System.out.println(names);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}
