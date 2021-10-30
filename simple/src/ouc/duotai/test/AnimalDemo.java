package ouc.duotai.test;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(24);
        System.out.println(a.getName()+a.getAge());
        a.eat();
        a = new Cat("劫匪",2);
        System.out.println(a.getName()+a.getAge());
        a.eat();

    }
}
