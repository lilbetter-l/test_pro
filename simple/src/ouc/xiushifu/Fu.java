package ouc.xiushifu;
/*
final 修饰的变量，成员方法，不能被继承和修改

*
*
* */
public class Fu {
    private void show(){
        System.out.println("private");
    }
    void show2(){
        System.out.println("默认");
    }
    public void show3(){
        System.out.println("public");
    }
    protected  void show4(){
        System.out.println("protected");
    }

    public static void main(String[] args) {
        //测试在本类中的权限，能不能访问到
        Fu f = new Fu();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }


}
