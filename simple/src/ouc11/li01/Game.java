package ouc11.li01;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Game {
    public static void main(String[] args) {
        //创建一个扑克牌的盒子
        ArrayList<String> arrayList = new ArrayList<String>();
        //定义花色数组
        String[] clors = {"😊","😂","😒","😘"};
        String[] numbers = {"2","3","4,","5,","6","7","8","9","J","Q","K","A"};
        for (String color:clors
             ) {
            for (String number:numbers
                 ) {
                arrayList.add(color+number);
            }

        }
        arrayList.add("小王");
        arrayList.add("大王");
        //洗牌的操作,也就是把扑克牌打算顺序
        Collections.shuffle(arrayList);

        //发牌，也就是遍历集合操作
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        ArrayList<String> a3 = new ArrayList<String>();
        ArrayList<String> a4 = new ArrayList<String>();
        for (int i = 0; i < arrayList.size(); i++) {
            String poker = arrayList.get(i);
            if (i>=arrayList.size()-3){
                a4.add(poker);
            }else if(i%3==0){
                a1.add(poker);

            }else if (i%3==1){
                a2.add(poker);
            }else if (i%3==2){
                a3.add(poker);
            }

        }
        //看牌，也就是三个玩家遍历自己的牌
        lookPoker("lql",a1);
        lookPoker("love",a2);
        lookPoker("ouc",a3);



        System.out.println(arrayList);
    }
    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> arrayList){
        System.out.println(name+"的牌是:");
        for (String poker:arrayList
             ) {
            System.out.print(poker+", ");
        }
        System.out.println();
    }
}
