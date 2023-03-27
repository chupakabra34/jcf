package task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 5; z++) {
            System.out.printf("Введите %d-ю строку: ", z + 1);
            str.add(String.valueOf(string.readLine()));
        }
        for (int z = 0; z < 13; z++) {
            String stroka = str.get(str.size() - 1);
            str.remove(str.size() - 1);
            str.add(0, stroka);
            for (String spisok : str) {
                System.out.println(spisok);
            }
            System.out.println();
        }
    }
}
