package ouc.li1026.Interface.test;

public class BasketballCoach extends Coach implements Speak {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球简练吃羊肉，喝羊奶！");

    }

    @Override
    public void speak() {
        System.out.println("篮球教练说英语！1！");
    }
}
