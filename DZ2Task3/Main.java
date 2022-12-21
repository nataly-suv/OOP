package DZ2Task3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей"); // создали человека
        Dog dog = new Dog("Бобик", "гав-гав"); // создали собаку
        Cat cat = new Cat("Васька", "мяу-мяу"); // создали кошку
        Fish fish = new Fish("Зорька"); // создали рыбку

        person.choice(); // запросили, что хочет сделать Человек
        
        // сохранили сделанный выбор и позвали собаку или кошку 
        int personChoise = person.call(dog, cat); 

        if (personChoise == 1) {  // покормить собаку
            dog.moving(); // собака подошла
            person.getFeed(); // Человек насыпал корм
            dog.eat(); // собака поела 
        } else if (personChoise == 2) {  // покормить кошку
            cat.moving();  // кошка подошла
            person.getFeed(); // Человек насыпал корм
            cat.eat(); // кошка поела
        } else if (personChoise == 3) {  // покормить рыбку
            person.getFeed(); // Человек насыпал корм
            fish.moving(); // рыбка подплыла 
            fish.eat(); // рыбка поела 
        }

    }

}
