package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Маркина", "Арина");
        map.put("Маркин", "Артём");
        map.put("Степанов", "Пётр");
        map.put("Ульянов", "Богдан");
        map.put("Лаптева", "Варвара");
        map.put("Егоров", "Никита");
        map.put("Новиков", "Фёдор");
        map.put("Петрова", "Елизавета");
        map.put("Леонов", "Егор");
        map.put("Воробьев", "Дмитрий");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Для теста
        //
        // System.out.println(createMap());
        // System.out.println(getCountTheSameFirstName(createMap(), "Арина"));
        // System.out.println(getCountTheSameLastName(createMap(), "Петрова"));
        //
    }
}
