package DZ1Task3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей", "owener");
        Person person2 = new Person("Иван", "no owener");
        Cat cat = new Cat("Васька");
        person.call(person.getStatus(), cat);

        System.out.print("\n");
        person.call(person2.getStatus(), cat);

    }

}
