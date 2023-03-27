package task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Requirements:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        Random random = new Random();
        int[] array = new int[20];
        System.out.println("Случайные числа: ");
        for (int z = 0; z < 20; z++) {
            array[z] = random.nextInt(1000);
            System.out.printf(" %d", array[z]);
        }
        System.out.printf("\n");
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        Arrays.sort(array);
        System.out.printf("Максимальное число в массиве - ");
        return array[array.length - 1];
    }
}
