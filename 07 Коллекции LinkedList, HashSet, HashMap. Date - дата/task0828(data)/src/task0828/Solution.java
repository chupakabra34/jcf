package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер месяца: ");
        int mount = Integer.parseInt(reader.readLine());
        Map<Integer, String> mapMonths = new HashMap<Integer, String>();
        for (int z = 1; z < 13; z++) mapMonths.put(z, String.valueOf(Month.of(z)));
        mapMonths.forEach((key, value) -> {
            if (key.equals(mount)) {
                System.out.printf("%S is the %d month", value, mount);
            }
        });
    }
}