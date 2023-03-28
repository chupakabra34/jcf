package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        boolean proverka = false;

        //напишите тут ваш код

        while (!proverka) {
            System.out.print("Введите 2 числа через пробел: ");
            String[] number = reader.readLine().split(" ");
            n = Integer.parseInt(number[0]);
            m = Integer.parseInt(number[1]);
            if (m < n) {
                proverka = true;
            } else System.out.println("Второе число, должно быть меньше первого!!!");
        }
        for (int z = 0; z < n; z++) {
            System.out.printf("Введите %d-ю строку из %d: ", z + 1, n);
            array.add(reader.readLine());
        }
        System.out.printf("Список перед обработкой: %s \n", array);
        while (m != 0) {
            String str = array.get(0);
            array.remove(0);
            array.add(str);
            m--;
        }
        System.out.printf("Список после обработки: %s \n", array);
    }
}