package Lesson10_DSA_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Contact> contacts = new ArrayList<>();
//        contacts.add(new Contact("Enzo", "anfsdjn@gmail", "009009"));
//        contacts.add(new Contact("Palmer", "anfsdjn@gmail", "009009"));
//        contacts.add(new Contact("Caicedo", "anfsdjn@gmail", "009009"));
//        contacts.add(new Contact("James", "anfsdjn@gmail", "009009"));
//        contacts.add(1, new Contact("Chalobah", "anfsdjn@gmail", "009009"));
//
//
//        Iterator<String> iterator = contacts.iterator();
//        while (iterator.hasNext()) {
//            String student = iterator.next();
//            System.out.println(student);
//        }
//
//        // for-each loop
//        System.out.println("Trc khi xoá");
//        for(Contact c : contacts) {
//            System.out.println(c.toString());
//        }
//
//        System.out.println("Sau khi xoá");
//        contacts.remove(3);
//        for(Contact c : contacts) {
//            System.out.println(c.toString());
//        }
//    }

        // treeset: sx bang chu cai
        // linkedset: sx thứ tự
        Set<String> students = new TreeSet<>();
        students.add("gg");
        students.add("h");
        students.add("d");
        students.add("a");
        students.add("c");

        for (String s : students) {
            System.out.println(s);
        }
    }
}
