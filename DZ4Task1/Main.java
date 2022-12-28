package DZ4Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // создала объект класса PrintPlaner
        // отвечает за форматированеи файла csv и вывод в консоль планера
        PrintPlaner printPlaner = new PrintPlaner();
        ArrayList<String> planer = printPlaner.planerArrayList();
        ArrayList<String[]> planerSplite = printPlaner.planerSplite(planer);

        // создала объект класса PrintTaskInPlaner
        // отвечает за вывод задач опередленного уровня
        PrintTaskInPlaner printTaskInPlaner = new PrintTaskInPlaner(planerSplite);

        // создала объект класса AddTask
        // отвечает за добавление задачи в csv файл
        AddTask addTask = new AddTask();

        // создала объект класса Talking
        // отвечает за прием данных от пользователя
        Talking ask = new Talking();

        Scanner in = new Scanner(System.in);

        // вывела на экран первый диалог
        ask.firstQuestion();

        // считала, что ввел поьлзователь
        int chois = in.nextInt();
        if (chois == 1) { // "1. Распечатать планер"
            printPlaner.printPlaner(planerSplite);
        } else if (chois == 2) { // "2. Вывести на экран задачи с определнным уровнем приоритета"

            // вопрос о том, какого уровня задачи нужн овывести
            ask.choisTask();
            int choisTask = in.nextInt();
            // запустила метод в классе PrintTaskInPlaner,
            // отвечающий за вывод зада определенного уровня
            printTaskInPlaner.printTask(choisTask);

        } else if (chois == 3) { // "3. Добавить задачу в планер"
            addTask.writeInPlaner();

        } else
            System.out.println("Выш вбор непонятен");
    }
}
