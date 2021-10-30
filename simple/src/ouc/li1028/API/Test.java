package ouc.li1028.API;

import ouc.li1028.niminginner.Use.Cat;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("start");
//        System.exit(0);

        System.out.println("end");
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for(int i =1;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共消耗时间："+(end-start)+"毫秒");
        Cat c = new Cat();
        System.out.println(c.toString());






    }

}
