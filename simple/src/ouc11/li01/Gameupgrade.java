package ouc11.li01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Gameupgrade {
    public static void main(String[] args) {
        //创建hashmap,键是编号，值是牌
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        //创建arraylist,存储编号
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //创建花色数组和点数数组
        String[] clors = {"😊","😂","😒","😘"};
        String[] numbers = {"2","3","4,","5,","6","7","8","9","J","Q","K","A"};

        //从0开始往hashmap数组中存储编号，并对存储对应的牌，同时往arraylist里面存储编号
        int index = 0;
        for (String color:clors) {
            for (String number:numbers){
                hm.put(index,color+number);
                arrayList.add(index);
                index++;
            }

        }
        hm.put(index,"小王");
        arrayList.add(index);
        index++;
        hm.put(index,"大王");
        arrayList.add(index);
        //洗牌，洗得是编号
        Collections.shuffle(arrayList);
        //发牌。，发的也是编号
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        TreeSet<Integer> treeSet3 = new TreeSet<Integer>();
        TreeSet<Integer> treeSet4 = new TreeSet<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i>=arrayList.size()-3){
                treeSet4.add(arrayList.get(i));
            }else if(i%3==0){
                treeSet.add(arrayList.get(i));
            }else  if (i%3==1){
                treeSet2.add(arrayList.get(i));
            }else if (i%3==2){
                treeSet3.add(arrayList.get(i));
            }

        }
        //调用看牌方法
        lookpoker("lql",treeSet,hm);
        lookpoker("love",treeSet2,hm);
        lookpoker("ouc",treeSet3,hm);
        lookpoker("底牌",treeSet4,hm);


    }
    //定义看牌方法
    public static void lookpoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name+"的牌是：");
        for (Integer i : ts){
            String poker = hm.get(i);
            System.out.print(poker+",");
        }
        System.out.println();
    }

}
