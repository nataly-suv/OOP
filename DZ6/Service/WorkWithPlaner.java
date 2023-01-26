package DZ6.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithPlaner {

    ArrayList<String> planer = new ArrayList<>();
    ArrayList<String[]> planerSplite = new ArrayList<>();

    public WorkWithPlaner() {

    }

    // метод переброса csv файла в ArrayList со строками
    public ArrayList<String> planerArrayList() throws IOException {
        FileReader inFile = new FileReader("DZ6/planer.csv");
        Scanner file = new Scanner(inFile);

        while (file.hasNextLine()) {
            String line = file.nextLine();
            planer.add(line);
        }

        return planer;

    }

    // метод преобразования планера из ArrayList<String> в ArrayList <String[]>
    public ArrayList<String[]> planerSplite(ArrayList<String> planer) {
        for (String element : planer) {

            String[] lineTemp = element.split(";");
            planerSplite.add(lineTemp);

        }
        return planerSplite;
    }


}
