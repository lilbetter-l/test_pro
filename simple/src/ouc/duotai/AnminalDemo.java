package ouc.duotai;

//多态的前提：
//
//
//有集成，有重写方法，有父类引用指向子类对象
//有父类引用指向子类对象编译看左边，执行看右边
//编译看左边，运行看右边,父类型作为参数，使用的是子类型参与操作
public class AnminalDemo {
    public static void main(String[] args) {
//        //有父类引用指向子类对象
//        Anminal a = new Cat();
//        System.out.println(a.age);
//        a.eat();
        AnimalOperate o = new AnimalOperate();
        //向上转型
        Anminal c = new Cat();
        o.useAnimal(c);
        Anminal d = new Dog();
        o.useAnimal(d);
        //向下转型,可以访问子类特有的功能
        Cat cat = (Cat) c;
        cat.eat();
        cat.playgame();




    }

}
