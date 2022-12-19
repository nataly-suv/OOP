package DZ1Task2;

public class Locker {
    private String status;

    public Locker(String status) {
        this.status = status;
    }

    // метод открытия шкафа
    public static Locker openLocker(Person p, Locker l) {
        if (p.getKey() == "Yes" && l.getStatus() == "Close") {
            l.setStatus("Open");
            System.out.println("Ура, шкаф открыт!");
        }
        return l;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Locker [status = " + status + "]";
    }

}
