package DZ7;

import java.io.IOException;
import java.util.ArrayList;

import DZ7.Model.ModelAdmin;
import DZ7.Model.ModelUser;
import DZ7.View.View;
import DZ7.View.ViewUser;

public class Presenter {

    public void button() throws IOException {
        System.out.println("Добро пожаловать!");

        String name = new View().authorize();

        if (name.equals("admin")) {
            System.out.println("Приступаем к работе!");

        } else {
            int choice = new ViewUser().showUserMenu();
            if (choice == 1) {
                int count = new ModelUser().checkCount(name);
                if (count < 5){
                    String film = new ViewUser().checkFilm();
                    ArrayList<String> filmsLine  = new ModelAdmin().checkFilm();
                    if (filmsLine.contains(film)){
                        System.out.println("Приятного просмотра");
                    } else System.out.println("Сожалем. Такого фильма нет");
                    
                } else System.out.println("Сожалем. Мы не можем выдать вам фильм");

            } else System.out.println("Спасибо, что вернули фильм");

        }

    }
}
