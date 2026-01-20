package Lesson10_DSA_2_practice;

public class SimpleList {
    int [] data = new int[5];
    int size = 0;

    public void add (int value){
    if (size < 5){
        data[size] = value;
        size++;

        }
    }
    void print(){
        for (int i=0; i<size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
