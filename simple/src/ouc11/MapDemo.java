package ouc11;

import ouc.li1030.Stu_Collection.Stu;

import java.sql.SQLOutput;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "lql");
        map.put(2, "love");
        map.put(3, "ouc");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(1));
//        while (map.containsKey(1)){
//            System.out.println(map);
//        }
        map.remove(1);
        System.out.println(map);
//        for (int i = 0; i < map.size(); i++) {
//            map.remove(i+1);
//        }
        if (map.isEmpty() == false) {
            System.out.println(map.size());
            System.out.println(map);
        }

        //下面的是获取键值对的操作
        System.out.println(map.get(1));
        Set<Integer> keyset = map.keySet();
        for (Integer i : keyset
        ) {
            System.out.println(i);
        }
        Collection<String> collection = map.values();
        for (String s : collection
        ) {
            System.out.println(s);
        }

        System.out.println("下面的是遍历操作");
        Set<Integer> integers = map.keySet();
        for (Integer i : integers
        ) {
            String s = map.get(i);
            System.out.println(i + "," + s);
        }
        System.out.println("获取所有键值对对象和的集合");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> me : entrySet
        ) {
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("下面的是遍历学生类对象");
        HashMap<String, Stu> hm = new HashMap<String, Stu>();
        Stu s1 = new Stu("lql", 24);
        Stu s2 = new Stu("lql2", 25);
        Stu s3 = new Stu("lql3", 26);
        hm.put("1", s1);
        hm.put("2", s2);
        hm.put("3", s3);
        //第一种方式，键找值
        Set<String> strings = hm.keySet();
        for (String key : strings
        ) {
            Stu value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());

        }

        //第二种方式
        Set<Map.Entry<String, Stu>> entries = hm.entrySet();
        for (Map.Entry<String, Stu> me : entries
        ) {
            String key = me.getKey();
            Stu value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        //元素的嵌套
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String,String >>();
        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("李奇伦","加油！");
        hm1.put("李宝宝","可爱！");
        arrayList.add(hm1);
        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("李奇伦","加油！");
        hm2.put("李宝宝","可爱！");
        arrayList.add(hm2);
        for (HashMap<String,String> hmm:arrayList
             ) {
            Set<String> keySet = hmm.keySet();
            for (String key:keySet
                 ) {
                String value = hmm.get(key);
                System.out.println(key+","+value);
            }

        }
        //创建hashmap对象
        HashMap<String,ArrayList<String>> hm3 = new HashMap<String,ArrayList<String>>();
       //创建arraylist对象
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("lql");
        arrayList1.add("加油呀！");
        hm3.put("目前的第一步",arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("lql");
        arrayList2.add("加油呀！");
        hm3.put("目前的第二步",arrayList2);
        Set<String> keySet = hm3.keySet();
        for (String key:keySet
             ) {
            System.out.println(key);
            ArrayList<String> value = hm3.get(key);
            for (String s:value
                 ) {
                System.out.println("\t"+s);
            }

        }




    }
}
