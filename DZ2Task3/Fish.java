package DZ2Task3;

public class Fish extends Animal implements Moving, Eat {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("рыбка " + name + " подплыла к кормушке");

    }

    @Override
    public void eat() {
        System.out.println("рыбка " + name + " поела");

    }

}
