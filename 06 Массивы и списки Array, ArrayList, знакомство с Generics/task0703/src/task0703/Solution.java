package task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[10];
        String[] array = new String[10];
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 10; z++) {
            System.out.printf("Введите %d-ю строку: ", z + 1);
            array[z] = str.readLine();
            num[z] = array[z].length();
        }
        for (int z = 0; z < 10; z++) {
            System.out.printf("%d-ая строка имеет длину - %d\n", z + 1, num[z]);
        }
    }
}