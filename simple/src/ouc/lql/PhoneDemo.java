package ouc.lql;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone apple = new Phone();

        apple.brand="苹果";

        System.out.println(apple.brand);
        apple.setAge(-1);
        apple.show();

    }
}

//栈内存和堆内存的区别，一般来说，堆内存都是new出来的
//多个对象指向相同的地址，不同的地址，对象内存图
/*
成员变量：类中方法外的变量，在堆内存
局部变量：方法中的变量，在栈内存
*/


