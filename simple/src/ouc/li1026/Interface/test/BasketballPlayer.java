package ouc.li1026.Interface.test;

public class BasketballPlayer  extends Player implements Speak{

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉喝牛奶！");
    }

    @Override
    public void study() {
        System.out.println("学习如何运球和偷懒!");
    }

    @Override
    public void speak() {
        System.out.println("学习如何说英语！！！");
    }
}
