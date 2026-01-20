package Lesson10_DSA_1;

import java.util.Arrays;

public class MyArrayList {
    private int[] data;
    private int size;
    public MyArrayList() {
    data = new int[10];
    size = 0;
    }

    public void add (int value) {
        // nếu mảng đầy thì tăng kích thước
        if (size == data.length) {
            resize();
        }
        data[size] = value;
        size++;
    }

        // lấy phần tử theo index
    public int get (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    // xoá phần tử tại index
    public void remove (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // dồn các phần tử sang trái
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }
// tăng kích thước mảng
    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    public int size(){
        return size;
    }
}
