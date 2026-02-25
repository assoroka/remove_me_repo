package org.example;

public class ArraySumTask {
    public static void main(String[] args) {
        int[] numbers = {3, -5, -2, 4, -8, 0};
        int sum = 0;

        for (int num : numbers) {
            if (num < 0 && num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Результат: " + sum);
    }
}
