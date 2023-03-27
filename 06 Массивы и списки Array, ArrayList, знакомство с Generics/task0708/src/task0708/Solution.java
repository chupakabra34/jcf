package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        int index = 0;
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 5; z++) {
            System.out.printf("Введите %d-ю строку: ", z + 1);
            str.add(String.valueOf(string.readLine()));
        }
        for (String s : str) {
            if (s.length() > index) {
                index = s.length();
            }
        }
        for (String s : str) {
            if (s.length() == index) {
                System.out.println(s);
            }
        }
    }
}
