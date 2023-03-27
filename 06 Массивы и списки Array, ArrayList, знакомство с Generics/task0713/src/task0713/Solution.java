package task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/* 
Играем в Золушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Requirements:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> glav = new ArrayList<>();
        ArrayList<Integer> devidedByThree = new ArrayList<>();
        ArrayList<Integer> devidedByTwo = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int x = 0; x < 20; x++) {
//            System.out.printf("Введите %d-ое число: ", x + 1);
//            int number = Integer.parseInt(reader.readLine());
//            glav.add(number);
//        }
        Random random = new Random();
        System.out.println("Случайные числа: ");
        for (int z = 0; z < 20; z++) {
            glav.add(z, random.nextInt(1, 10));
            System.out.printf(" %d", glav.get(z));
        }
        System.out.println();
        for (Integer integer : glav) {
            if (((integer % 3) == 0) && ((integer % 2) == 0)) {
                devidedByThree.add(integer);
                devidedByTwo.add(integer);
            } else if (integer % 3 == 0) {
                devidedByThree.add(integer);
            } else if (integer % 2 == 0) {
                devidedByTwo.add(integer);
            } else other.add(integer);
        }
        printList(devidedByThree);
        printList(devidedByTwo);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        System.out.println(list);
    }
}
