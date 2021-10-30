package ouc.li1028;

public class Out{

    public static void main(String[] args) {
        Out o = new Out();
        o.method();
    }
    private int num = 10;

    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }



}
