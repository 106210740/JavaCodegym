package Lesson8_CleanCode;
//// rename: đổi tên
//public class Calculator {
//    public double calculate(double firstNumber, double secondNumber, int operatorType) {
//        double r = 0;
//        if (operatorType == 1) {
//            r = firstNumber + secondNumber;
//        } else if (operatorType == 2) {
//            r = firstNumber - secondNumber;
//        }
//        return r;
//    }
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.calculate(1, 2, 3);
//
//    }
//}

    // refactor
public class Calculator {
    public void calculate(int[] numbers) {
        if (validateInput(numbers)) return;

        int sum = calculateSum(numbers);

        double average = calculateAverage(numbers, (double) sum);

        int max = findMax(numbers);

        int min = findMin(numbers);

        displayResult(sum, average, max, min);
    }

    private static void displayResult(int sum, double average, int max, int min) {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static double calculateAverage(int[] numbers, double sum) {
        double average = sum / numbers.length;
        return average;
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static boolean validateInput(int[] numbers) {
        // Validate input
        if (numbers == null) {
            System.out.println("Error: Array is null");
            return true;
        }
        if (numbers.length == 0) {
            System.out.println("Error: Array is empty");
            return true;
        }
        return false;
    }
}
