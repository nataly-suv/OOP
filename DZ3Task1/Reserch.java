package DZ3Task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserch implements Writer {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        return resultAge;
    }

    // метод записи в файл
    @Override
    public void writeInFile(ArrayList<String> inData) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter outFile = new FileWriter("DZ3Task1/file.txt", true);
        String answer = in.nextLine();
        if (answer.equals("Yes")) {
            for (String elemet : inData) {
                outFile.append(elemet + " ");
            }
            outFile.append("\n");
        }

        outFile.close();

    }

}
