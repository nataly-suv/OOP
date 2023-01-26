package DZ6.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddTask {

    int maxID = 0;
    String addInfo = "";

    public AddTask() {

    }

    // метод добавления строки в планер в файл csv
    public void writeInPlaner() throws IOException {

        FileWriter addTask = new FileWriter("DZ6/planer.csv", true);

        // запускаем метод addInfo, который формирует строку для добавления в планер
        String addInfo = addInfo();

        addTask.append(addInfo);
        addTask.append("\n");
        addTask.close();

    }

    // метод формирования строки с задачей для добавления в csv файл
    public String addInfo() throws IOException {

        int id = maxID();

        // проставили ID, предварительно узнав максимальный ID в планере
        addInfo = addInfo + (id + 1) + ";";

        // добавили текущую дату и время
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String nowDate = formatter.format(date);
        addInfo = addInfo + nowDate + ";";

        Scanner in = new Scanner(System.in, "Cp866");

        System.out.println("Введите фамилию автора задачи");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("Введте дедлайн в формате дд-мм-гггг");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("Кратко опишите задачу");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("Введите приоритет задачи (1 - не срочная, 2 - средняя, 3 - срочная)");
        addInfo = addInfo + in.nextLine();

        return addInfo;
    }

    // метод поиска максимального ID в сушествующем планере в файле csv
    public int maxID() throws IOException {
        WorkWithPlaner planer = new WorkWithPlaner();

        // получили планер в ввиде ArrayList<String[]>
        ArrayList<String[]> planerSplite = planer.planerSplite(planer.planerArrayList());

        String[] temp0 = planerSplite.get(0);
        maxID = Integer.parseInt(temp0[0]);

        for (int i = 0; i < planerSplite.size(); i++) {
            String[] temp = planerSplite.get(i);

            if (Integer.parseInt(temp[0]) > maxID) {
                maxID = Integer.parseInt(temp[0]);
            }
        }
        return maxID;
    }

}
