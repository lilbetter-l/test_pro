package ouc.li1026;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.sleep();
        a = new Dog();
        a.sleep();
        a.eat();

    }
}
