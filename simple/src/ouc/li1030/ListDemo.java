package ouc.li1030;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("i");
        list.add("love");
        list.add("you");
        list.add("you");
        System.out.println(list);
        Iterator<String> it  = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println(list.set(1,"lql"));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        for (int i =0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }



    }
}
