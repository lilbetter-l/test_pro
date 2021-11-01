package ouc.li1031;

import ouc.li1030.Stu_Collection.Stu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class FanXing {
    public static void main(String[] args) {
        Collection<String>c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100) ;
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);

        }

        Stu s = new Stu();
        s.setAge(30);
        s.setName("lql");

        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        /*Generic<String> g1 = new Generic<String>();
        g1.setT("lql");
        System.out.println(g1.getT());
        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());
        Generic<Stu> g3 = new Generic<Stu>();
        Generic<String> c2 = new Generic<String>();
        c2.show("lql");

*/
        Generic g = new Generic();
        g.show("ll");
        g.show(30);
        g.show(true);
        g.show(12.34);






    }
}
