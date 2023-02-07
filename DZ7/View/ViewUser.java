package DZ7.View;

import java.util.Scanner;

public class ViewUser {

    public int showUserMenu(){
        System.out.println("1 - Подать заявку на фильм");
        System.out.println("2 - Вернуть фильм");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        return num;
    }

    public String checkFilm (){
        System.out.print("Введите название фильма: ");

        Scanner sc = new Scanner(System.in, "Cp866");
        String film = sc.nextLine();
        
        return film;
    }


    
}
