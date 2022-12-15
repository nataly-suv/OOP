package DZ1Task3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей", "owener");
        Person person2 = new Person("Иван", "no owener");
        Cat cat = new Cat("Васька");
        Call call = new Call(person, cat);
        call.call();

        System.out.print("\n");
        Call call2 = new Call(person2, cat);
        call2.call();

    }

}
