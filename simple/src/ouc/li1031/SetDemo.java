package ouc.li1031;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("hello1");
        set.add("hello2");
        for (String s:set
             ) {
            System.out.println(s);
        }
    }

}
