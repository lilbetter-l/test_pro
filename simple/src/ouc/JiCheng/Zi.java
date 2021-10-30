package ouc.JiCheng;
//继承中的访问特点：先是在在局部找，然后再子类中查找，在就是在父类中查找
public class Zi extends Fu {
    public int height = 180;
    public int age = 22;
    public void show_age_height(){
        int age = 18;
        //我要访问本类的成员变量，怎么办呢？this关键字
        //我要访问父类的成员变量，怎么办呢？super关键字
        System.out.println(super.age+","+height+this.age);
    }
    public void showmethod(){
        System.out.println("子类的method方法被调用！");
    }
    public void show(){
        super.show();
        System.out.println("这是子类的方法哦！");
    }
    public Zi(){
        super(25);
        System.out.println("子类中无参构造方法被调用");
    }
    public Zi(int age ){
        super(23);
        System.out.println("子类带参参构造方法被调用");
    }
}

