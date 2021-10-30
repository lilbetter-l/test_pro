package ouc.li1030;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listitrrator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("l");
        list.add("love");
        list.add("you!");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if (s.equals("love")){
                lit.add("very love");
            }
        }
        System.out.println(list);
    }
}
