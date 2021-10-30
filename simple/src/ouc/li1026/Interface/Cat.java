package ouc.li1026.Interface;

public class Cat extends Animal implements Jumping{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("猫可以吃鱼了！！");
    }

    @Override
    public void jump() {
        System.out.println("猫可以调高！");
    }
}
