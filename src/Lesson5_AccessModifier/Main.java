package Lesson5_AccessModifier;

//// Student
//public class Main {
//    public static void main(String[] args) {
//        Student s = new Student("Tuan Anh", 19);
//
//        System.out.println(s.getName());
//        System.out.println(s.getAge());
//    }
//}

//// Counter
//public class Main {
//    public static void main(String[] args) {
//
//        Counter   c1 = new Counter();
//        Counter   c2 = new Counter();
//        Counter   c3 = new Counter();
//        System.out.println(Counter.count);
//    }
//}


//// Calculator
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(Calculator.add(3, 6));
//        System.out.println(Calculator.subtract(8, 6));
//    }
//}

//// School
//public class Main {
//    public static void main(String[] args) {
//        School.change();
//        School s1 = new School(111, "Hoang");
//        School s2 = new School(222, "Thanh");
//        School s3 = new School(333, "Nam");
//        s1.display();
//        s2.display();
//        s3.display();
//    }
//}

//Person
public class Main {
    public static void main(String[] args) {
        Person.change();

        Person s1 = new Person(111, "Hoang");
        Person s2 = new Person(111, "Khanh");
        Person s3 = new Person(111, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}