package ouc.li1026.Interface.canshu;

public class CatOpeator {
    public void usecat(Cat c ){
        c.eat();
    }
    public Cat getcat(){
        Cat c = new Cat();
        return c;
    }
}
