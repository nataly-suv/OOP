package DZ7.View;

import java.util.Scanner;

public class View {
    
    public String authorize(){
        System.out.println("Введите имя:");
        Scanner sc = new Scanner(System.in);
        var name =  sc.nextLine();
        
        return name;
    }
    
}
