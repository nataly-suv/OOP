package DZ6;

import java.io.IOException;
import java.util.Scanner;

import DZ6.Service.AddTask;
import DZ6.Service.PrintTaskInPlaner;

public class Presenter {

    public void button() throws IOException {

        // запрос о том, что необходимо стелать
        Scanner in = new Scanner(System.in);
        new View().firstQuestion();
        int chois = in.nextInt();

        if (chois == 1) { // "1. Распечатать планер"
            new Model().printPlaner(new Model().planerSplite());

        } else if (chois == 2) { // "2. Вывести на экран задачи с определнным уровнем приоритета"

            // вопрос о том, какого уровня задачи нужн овывести
            new View().choisTask();
            int choisTask = in.nextInt();
            // запустила метод в классе PrintTaskInPlaner,
            // отвечающий за вывод задачи определенного уровня
            new PrintTaskInPlaner(new Model().planerSplite()).printTask(choisTask);

        } else if (chois == 3) { // "3. Добавить задачу в планер"
            new AddTask().writeInPlaner();

        } else
            System.out.println("Выш вбор непонятен");

    }
}