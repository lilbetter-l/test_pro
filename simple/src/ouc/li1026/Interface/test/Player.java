package ouc.li1026.Interface.test;

public abstract class Player extends Person {
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }
    public abstract void study();
}
