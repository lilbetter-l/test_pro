package ouc.lql;


import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.add("hello"));
        arrayList.add("world");
        arrayList.add(1,"lql");
        System.out.println(arrayList);
        //System.out.println(arrayList.remove("hello"));
        //System.out.println(arrayList.remove(1));
        //System.out.println(arrayList.remove(3));
        System.out.println(arrayList.set(1,"java"));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());

        System.out.println(arrayList);*/
        //创建字符串集合
        ArrayList<String> array = new ArrayList<String>();
        //向集合中添加字符串对象
        array.add("hello");
        array.add("world");
        array.add("lql");
        array.add("money");
        //遍历集合
        /*System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));*/

        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }











    }




}
