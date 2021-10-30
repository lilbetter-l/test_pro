package ouc.li1026.Interface;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumping j = new Cat();
        j.jump();
        Animal a = new Cat();
        a.setAge(2);
        a.setName("加菲！");
        System.out.println(a.getAge()+","+a.getName());
        a.eat();

        Cat c = new Cat();

    }
}
