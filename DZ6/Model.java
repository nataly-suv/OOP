package DZ6;

import java.io.IOException;
import java.util.ArrayList;

import DZ6.Service.WorkWithPlaner;

public class Model {

    public  ArrayList<String[]>  planerSplite() throws IOException {
        
        // создала объект класса WorkWithPlaner
        // создала планер, состоящий из ArrayList<String[]>
        
        WorkWithPlaner planer = new WorkWithPlaner();
        ArrayList<String> planerString = planer.planerArrayList();
        ArrayList<String[]> planerSplite = planer.planerSplite(planerString);

        return planerSplite;
    }


        // метод печати планера
        public void printPlaner(ArrayList<String[]> planerSplite) {
            for (String[] element : planerSplite) {
    
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            }
        }

}
