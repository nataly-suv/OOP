package DZ1Task1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person igor = new Person("Игорь");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentChild(irina, masha); // Ирина родитель Маши
        gt.appendPerentChild(vasya, jane);
        gt.appendPerentChild(vasya, ivan);
        gt.appendVifeHusbent(irina, igor); // Ирина жена Игоря
        gt.appendPerentChild(igor, vasya); // Игорь родитель Васи
        gt.appendPerentChild(igor, masha); // Игорь родитель Маши

        System.out.println("Дети Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println("Дети Игоря");
        System.out.println(new Reserch(gt).spend(igor,
                Relationship.parent));

        System.out.println("Муж Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.vife));

    }

}
