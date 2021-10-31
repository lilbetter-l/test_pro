package ouc.li1031;

import java.util.LinkedHashSet;

public class LinkHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> link = new LinkedHashSet<String>();
        link.add("hello");
        link.add("hello2");
        link.add("hello3");
        link.add("hello3");
        for (String s:link
             ) {
            System.out.println(s);
        }
    }
}
