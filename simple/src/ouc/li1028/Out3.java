package ouc.li1028;

public class Out3 {
    private int age = 10;
    public void method(){
        class Inner{
            public void show(){
                System.out.println(age);
            }
        }
        Inner i =new Inner();
        i.show();
    }
}
