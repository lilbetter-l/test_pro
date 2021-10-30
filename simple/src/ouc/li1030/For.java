package ouc.li1030;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        int[] arr ={112,3,4,5,6,7};
        for (int i:arr
             ) {
            System.out.println(i);
        }
        String[] strarr ={"hello","world","you"};
        for (String s:strarr
             ) {
            System.out.println(s);
        }
        System.out.println("111111111111111111111111");
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("lql");
        for (String s:list){
            System.out.println(s);
        }


    }
}
