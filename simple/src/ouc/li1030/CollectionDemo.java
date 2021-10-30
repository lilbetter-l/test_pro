package ouc.li1030;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("lql");
        System.out.println(c);
        System.out.println(c.size());
        System.out.println("`````````````````````````");
        Collection<String> cc = new ArrayList<String>();
        System.out.println(c.add("i "));
        System.out.println(c.add("love"));
        System.out.println(c);
        c.remove("love");
        System.out.println(c);
        System.out.println(c.contains("love"));
        System.out.println(c.isEmpty());
        System.out.println("下面的是迭代器操作");
        Iterator<String> it = c.iterator();
        if (it.hasNext()){
            System.out.println(it.next());
        }
        //用while循环进行改进一下
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }




    }
}
