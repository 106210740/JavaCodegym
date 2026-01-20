package Lesson10_DSA_3;

import java.util.LinkedList;

public class Demo_Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        System.out.println(list);

        // delete ptu đầu
        list.removeFirst();
        System.out.println(list);
    }
}
