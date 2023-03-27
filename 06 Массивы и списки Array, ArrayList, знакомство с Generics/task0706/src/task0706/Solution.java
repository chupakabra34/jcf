package task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* 
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


Requirements:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
5. Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int chet = 0;
        int nechet = 0;
        int[] array = new int[15];

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int x = 0; x < array.length; x++) {
//            System.out.printf("Введите %d-ое число: ", x + 1);
//            int number = Integer.parseInt(reader.readLine());
//            array[x] = number;
//        }

        Random random = new Random();
        System.out.println("Случайные числа: ");
        for (int z = 0; z < 15; z++) {
            array[z] = random.nextInt(0, 10);
            System.out.printf(" %d", array[z]);
        }
        System.out.println();
        for (int z = 0; z < 15; z++) {
            if (array[z] % 2 == 0) chet += array[z];
            else nechet += array[z];

        }
        if (chet > nechet) System.out.println("В домах с четными номерами проживает больше жителей");
        else System.out.println("В домах с нечетными номерами проживает больше жителей");
    }
}
