package ouc.JiCheng;
/*
* 新手机*/
public class NewPhone extends Phone{
    //重写父类中的方法，和重载要区分开哦！！！
    //override是一个重写的注解
    @Override
    public void call(String name) {
        System.out.println("开启视频功能!!");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }


}
