package ouc.li1026.Interface.test;

public class PersonDemo {
    public static void main(String[] args) {
        BasketballPlayer ppp = new BasketballPlayer();
        ppp.setAge(2);
        ppp.setName("loib");
        System.out.println(ppp.getAge()+","+ppp.getName());
        ppp.eat();
        ppp.study();
        ppp.speak();

    }
}
