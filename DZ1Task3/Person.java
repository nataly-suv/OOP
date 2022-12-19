package DZ1Task3;

public class Person {
    private String name;
    private String status;

    public Person(String name, String status) {
        this.name = name;
        this.status = status;

    }

    // метод когда человек зовет кошку
    public void kisKis(String name, Cat cat) {
        System.out.println(name + " зовет кошку: " + cat.getName() + " кис-кис-кис");
    }

    // человек зовет кошку
    public void call(String status, Cat cat) {
        if (status == "owener") {
            // если человек хозяин кошки
            kisKis(name, cat);
            cat.catComeIn(cat.getName()); // кошка приходит
        } else {
            // если человек не хозяин кошки
            kisKis(name, cat);
            cat.catComeOut(cat.getName()); // кошка не приходит
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
