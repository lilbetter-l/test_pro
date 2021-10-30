package ouc.li1026;
//抽象类
public abstract class Animal {
    private int age = 20;
    private final String city = "背景";

    //抽象类
    public abstract void eat();
    public Animal(){}
    public Animal(int age){
        this.age = age;
    }
    public void sleep(){
        System.out.println(age+city);
        System.out.println("喜欢睡觉！！！");
    }
}
