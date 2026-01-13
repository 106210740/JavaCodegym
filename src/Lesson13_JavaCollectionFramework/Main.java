package Lesson13_JavaCollectionFramework;
//import.java.util.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> localStorage = new HashMap<>();
//        localStorage.put("username", "tuan anh");
//        localStorage.put("id", "fb_12345");
//        localStorage.put("token", "abcde333");
//        System.out.println("Local storage");
////        for (Map.Entry<String, String> entry : localStorage.entrySet()) {
////            System.out.println(entry.getKey() + ": " + entry.getValue());
////        }
//
//        // get treeSet
//        Set<String> keys = localStorage.keySet();
//        for (String key : keys) {
//            System.out.println(key + " : " + localStorage.get(key));
//        }
//        System.out.println("Ten dang nhap: " + localStorage.get("username"));


//        Map<String, Student> studentMap = new HashMap<>();
//studentMap.put("C01", new Student("C01", "tuan anh" , 3.5));
//studentMap.put("C02", new Student("C02", "bbb" , 3.3));
//         for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
//             System.out.println(entry.getKey() + " " + entry.getValue());
//         }

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(60);
        bst.insert(55);
        bst.insert(100);
        bst.insert(67);
        bst.insert(45);
        bst.insert(57);
        bst.insert(107);
        bst.insert(59);
        bst.insert(101);

//        bst.inOrder();
        bst.search(60);
    }
}
