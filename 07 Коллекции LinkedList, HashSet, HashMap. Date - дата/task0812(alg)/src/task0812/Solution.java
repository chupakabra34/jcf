package task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Requirements:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        for (int z = 0; z < 10; z++) {
            System.out.printf("Введите %d-е число: ", z + 1);
            list.add(Integer.parseInt(number.readLine()));
        }
        System.out.println("Введёные числа: " + list);
        int count = 1;
        int sum = 1;
        for (int z = 1; z < 10; z++) {
            if (list.get(z).equals(list.get(z - 1))) {
                count++;
            } else {
                count = 1;
            }
            if (count >= sum) {
                sum = count;
            }
        }
        System.out.println("Результат: " + sum);
    }
}