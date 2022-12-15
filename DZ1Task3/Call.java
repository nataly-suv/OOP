package DZ1Task3;

public class Call {
    Person p;
    Cat cat;

    public Call(Person p, Cat cat) {
        this.p = p;
        this.cat = cat;
    }

    public void call() {
        if (p.getStatus() == "owener") {
            // если человек хозяин кошки
            p.kisKis(p.getName());
            cat.catComeIn(cat.getName()); // кошка приходит
        } else {
            // если человек не хозяин кошки
            p.kisKis(p.getName()); 
            cat.catComeOut(cat.getName()); // кошка не приходит
        }

    }

}
