package ouc.li1028.niminginner.Use;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOpeater jo = new JumppingOpeater();
        Jumpping j = new Cat();
        jo.method(j);
        System.out.println("`````````````````````````````");
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以调高了！！！！");
            }
        });
    }
}
