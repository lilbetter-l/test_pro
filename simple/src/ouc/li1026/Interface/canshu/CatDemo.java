package ouc.li1026.Interface.canshu;

public class CatDemo {
    public static void main(String[] args) {
        CatOpeator co = new CatOpeator();
        Cat c = new Cat();
        co.usecat(c);
        Cat c2 = co.getcat();
        c2.eat();
    }

}
