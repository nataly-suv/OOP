package DZ3Task1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws IOException {
                Person irina = new Person("Ирина", 56);
                Person igor = new Person("Игорь", 60);
                Person vasya = new Person("Вася", 30);
                Person masha = new Person("Маша", 27);
                Person jane = new Person("Женя", 10);
                Person ivan = new Person("Ваня", 8);
                GeoTree gt = new GeoTree();
                gt.appendPerentChild(irina, vasya); // Ирина родитель Васи
                gt.appendPerentChild(irina, masha); // Ирина родитель Маши
                gt.appendPerentChild(vasya, jane); // Вася родитель Жени
                gt.appendPerentChild(vasya, ivan); // Вася родитель Ивана
                gt.appendVifeHusbent(irina, igor); // Ирина жена Игоря
                gt.appendPerentChild(igor, vasya); // Игорь родитель Васи
                gt.appendPerentChild(igor, masha); // Игорь родитель Маши

                Reserch newReserch = new Reserch(gt);

                // Ищем детей Ирины
                System.out.println("Дети Ирины");
                ArrayList<String> result = new Reserch(gt).spend(irina, Relationship.parent);
                System.out.println(result);
                System.out.println("Хотите записать результат в файл? (Yes или No)");
                newReserch.writeInFile(result);

                // Ищем детей Игоря
                System.out.println("Дети Игоря");
                ArrayList<String> result1 = new Reserch(gt).spend(igor, Relationship.parent);
                System.out.println(result1);
                System.out.println("Хотите записать результат в файл? (Yes или No)");
                newReserch.writeInFile(result1);

                // Ищем мужа Ирины (Чья жена Ирина?)
                System.out.println("Муж Ирины");
                ArrayList<String> result2 = new Reserch(gt).spend(irina, Relationship.vife);
                System.out.println(result2);
                System.out.println("Хотите записать результат в файл? (Yes или No)");
                newReserch.writeInFile(result2);

                // Ищем людей оперделенного возраста
                ArrayList<String> result3 = new Reserch(gt).searchAge();
                System.out.println(result3);
                System.out.println("Хотите записать результат в файл? (Yes или No)");
                newReserch.writeInFile(result3);

        }

}
