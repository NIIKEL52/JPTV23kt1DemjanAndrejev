package kontrollnaja;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static int[] generateRandom(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) * 2 + 1;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static double Average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int size = 100;
        int[] array = generateRandom(size);
        System.out.println("Массив случайных нечётных чисел:");
        printArray(array);
        Arrays.sort(array);
        System.out.println("\nОтсортированный массив:");
        printArray(array);
        double average = Average(array);
        System.out.println("\nСреднее арифметическое: " + average);
    }
}
