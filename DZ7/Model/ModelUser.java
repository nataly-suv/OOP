package DZ7.Model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ModelUser {

    // проверка фамилии
    public int checkName(String name) throws IOException {
        FileReader inFile = new FileReader("DZ7/user.csv");
        Scanner file = new Scanner(inFile);

        int temp = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] lineSplite = line.split(";");
            if (lineSplite[0].equals(name)) {
                temp = 1;
            } else
                temp = 0;

        }
        return temp;

    }

    // проверка количества фильмов на руках
    public int checkCount(String name) throws IOException {
        FileReader inFile = new FileReader("DZ7/user.csv");
        Scanner file = new Scanner(inFile);

        int temp = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] lineSplite = line.split(";");

            if (lineSplite[0].equals(name)) {
                temp = Integer.parseInt(lineSplite[1]);
            } 

        }
        return temp;
    }



}
