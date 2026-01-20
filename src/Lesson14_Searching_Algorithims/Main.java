//package Lesson14_Searching_Algorithims;
//
//public class Main {
////    public static void main(String[] args) {
//////        int[] numbers = new int[10];
//////        numbers[0] = 10;
//////        int [] numbers = {10,14,19,26,33};
//////        int value = 33;
//////        for (int i=0; i<numbers.length; i++){
//////            if (numbers[i] == value){
//////                System.out.print("Found " + value + " at index " + i + "\n");
//////                break;
//////            }
//////        }
//////    }
//////    public static void linearSearch(int[] numbers, int value){
//////        for (int i=0; i<numbers.length; i++){
//////            if (numbers[i] == value){
//////                return i;
//////            }
//////        }
//////        return -1;
////    }
//
////    public static int binarySearch(int[] numbers, int target) {
////        int low = 0, high = numbers.length - 1;
////        while (low >= high) {
////            int mid = (low + high) / 2;
////            if (numbers[mid] == target) {
////                return mid;
////            } else if (numbers[mid] < target) {
////                high = mid - 1;
////            } else {
////                low = mid + 1;
////            }
////
////            return -1;
////        }
////    }
////}
