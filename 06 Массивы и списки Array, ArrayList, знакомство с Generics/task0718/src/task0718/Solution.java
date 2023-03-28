package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<String>();
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 10; z++) {
            System.out.printf("Введите %d-е слово: ", z + 1);
            array.add(str.readLine());
        }
        for (int z = 0; z < array.size() - 1; z++) {
            if (array.get(z).length() > array.get(z + 1).length()) {
                System.out.printf("Индекс = %d, значение = %s", z, array.get(z));
                break;
            }
        }
    }
}