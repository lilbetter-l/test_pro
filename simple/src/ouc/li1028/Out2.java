package ouc.li1028;

public class Out2 {
    private int age = 10;

    //成员内部类
    private class Inner{
        public void show(){
            System.out.println(age);
        }
    }
    public  void method(){
        Inner i = new Inner();
        i.show();
    }
}
