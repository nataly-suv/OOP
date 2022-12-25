package DZ3Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей"); // создали человека
        Dog dog = new Dog("Бобик", "гав-гав"); // создали собаку
        Cat cat = new Cat("Васька", "мяу-мяу"); // создали кошку
        Fish fish = new Fish("Зорька", 10); // создали рыбку

        Fish whale = new Fish("Чудо-Юдо", 30000); // создали кита
        Fish shark = new Fish("Белуха", 4000); // создали акулу
        Fish carp = new Fish("Карп", 30); // создали карпа
        Fish petyshok = new Fish("Петушок", 5); // создали петушка
        Fish barbus = new Fish("Барбус", 10); // создали барбуса

        person.choice(); // запросили, что хочет сделать Человек

        // сохранили сделанный выбор и позвали собаку или кошку
        int personChoise = person.call(dog, cat);

        if (personChoise == 1) { // покормить собаку
            dog.moving(); // собака подошла
            person.getFeed(); // Человек насыпал корм
            dog.eat(); // собака поела
        } else if (personChoise == 2) { // покормить кошку
            cat.moving(); // кошка подошла
            person.getFeed(); // Человек насыпал корм
            cat.eat(); // кошка поела
        } else if (personChoise == 3) { // покормить рыбку
            person.getFeed(); // Человек насыпал корм
            fish.moving(); // рыбка подплыла
            fish.eat(); // рыбка поела
        }

        ArrayList<Fish> fishArray = new ArrayList<>();
        fishArray.add(whale);
        fishArray.add(shark);
        fishArray.add(carp);
        fishArray.add(petyshok);
        fishArray.add(barbus);
        Collections.sort(fishArray, new FishSizeComparator());
        System.out.println("\nСортируем рыбок по размеру:");
        for (Fish element : fishArray) {
            System.out.println(element);
        }
        System.out.println("\nАквариумные рыбки:");
        for (Fish element : fishArray) {
            if (element.getSize() < 15) {
                System.out.println(element);
            }
           
        }
    }

}
