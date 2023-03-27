package task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = new String[10];
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 8; z++) {
            System.out.printf("Введите %d-ю строку: ", z + 1);
            array[z] = str.readLine();
        }
//        Stream.iterate(array.length - 1, z -> z >= 0, z -> z - 1).map(z -> array[z]).forEach(System.out::println);
        for (int z = array.length; z > 0; z--) {
            System.out.printf("%d-ая строка - %s \n", z, array[z - 1]);
        }
    }
}