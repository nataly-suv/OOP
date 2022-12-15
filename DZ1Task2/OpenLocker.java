package DZ1Task2;

public class OpenLocker {
    Person p;
    Locker l;

    public OpenLocker(Person p, Locker l) {
        this.p = p;
        this.l = l;
    }

    public Locker openLocker() {
        if (p.getKey() == "Yes" && l.getStatus() == "Close") {
            l.setStatus("Open");
            System.out.println("Ура, шкаф открыт!");
        }
        return l;

    }

}
