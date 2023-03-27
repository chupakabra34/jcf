package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        int min = 1000;
        int max = 0;
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 10; z++) {
            System.out.printf("Введите %d-ю строку: ", z + 1);
            str.add(String.valueOf(string.readLine()));
        }
        for (int z = 0; z < 10; z++) {
            if (str.get(z).length() < min) {
                min = str.get(z).length();
            } else if (str.get(z).length() > max) {
                max = str.get(z).length();
            }
        }
        for (int z = 0; z < 10; z++) {
            if (str.get(z).length() == min) {
                System.out.println(str.get(z));
                break;
            } else if (str.get(z).length() == max) {
                System.out.println(str.get(z));
                break;
            }
        }
    }
}
