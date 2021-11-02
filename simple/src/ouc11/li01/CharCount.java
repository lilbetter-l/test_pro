package ouc11.li01;

import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //创建一个hashmap集合
        //hashmap是没有顺序的
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = hm.get(key);
            if (value == null){
                hm.put(key,1);
            }else{
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character c:keySet
             ) {
            Integer value = hm.get(c);
            sb.append(c).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);


        System.out.println("下面的是list的操作");
        List<Integer> list = new ArrayList<>();
        list.add(83);
        list.add(823);
        list.add(833434);
        list.add(83543);
        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);





    }
}
