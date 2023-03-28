package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();
        Human grandFather = new Human("Валера", true, 77);
        Human grandMother = new Human("Фимка", false, 75);
        Human grandFather2 = new Human("Дормидон", true, 87);
        Human grandMother2 = new Human("Матрона", false, 85);
        Human father = new Human("Кирилл", true, 47, grandFather, grandMother2);
        Human mother = new Human("Екатерина", false, 45, grandFather2, grandMother);
        Human child = new Human("Маша", false, 15, father, mother);
        Human child2 = new Human("Петя", true, 11, father, mother);
        Human child3 = new Human("Октябрина", false, 8, father, mother);
        family.add(grandFather);
        family.add(grandFather2);
        family.add(grandMother);
        family.add(grandMother2);
        family.add(father);
        family.add(mother);
        family.add(child);
        family.add(child2);
        family.add(child3);
        family.iterator().forEachRemaining(System.out::println);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}