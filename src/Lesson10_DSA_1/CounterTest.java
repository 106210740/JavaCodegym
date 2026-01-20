package Lesson10_DSA_1;

public class CounterTest {
    public static void main(String[] args) {
        Counter c =  new Counter();
        c.increase();
        c.increase();
        System.out.println(c.getCount());

    }
}
