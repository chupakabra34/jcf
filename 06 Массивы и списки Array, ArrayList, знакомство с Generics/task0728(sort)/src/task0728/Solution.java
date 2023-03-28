package task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Requirements:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. В классе Solution должен быть метод public static void sort(int[] array).
4. Метод main должен вызывать метод sort.
5. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
/*
            for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
*/
        Random random = new Random();
        System.out.println("Случайные числа: ");
        for (int z = 0; z < 20; z++) {
            array[z] = random.nextInt(1, 100);
            System.out.printf(" %d ", array[z]);
        }
        sort(array);
        System.out.println();
        System.out.println("Отсортированные числа по убыванию:");
        for (int x : array) {
            System.out.print(" " + x + " ");
        }
    }

    public static void sort(int[] array) {
        Integer[] rezult = new Integer[array.length];
        for (int z = 0; z < array.length; z++) {
            rezult[z] = array[z];
        }
        Arrays.sort(rezult, Collections.reverseOrder());
        for (int z = 0; z < array.length; z++) {
            array[z] = rezult[z];
        }
    }
}