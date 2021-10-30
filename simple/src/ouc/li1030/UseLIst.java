package ouc.li1030;

import ouc.li1030.Stu_Collection.Stu;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseLIst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("lql");
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("````````````````````````````");
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("hello");
        llist.add("world");
        llist.add("lql");
        llist.add("happy");
        for (String s:llist
             ) {
            System.out.println(s);
        }

        System.out.println("使用arraylist实现遍历学生对象");
        ArrayList<Stu> slist = new ArrayList<Stu>();
        Stu s1  = new Stu("lql",24);
        slist.add(s1);
        for (Stu s:slist
             ) {
            System.out.println(s.getAge()+s.getName());
        }
        System.out.println("下面的是使用linkedlist的方式实现的！！！！！");
        LinkedList<Stu> ss = new LinkedList<Stu>();
        ss.add(s1);
        for (Stu s:ss
             ) {
            System.out.println(s.getAge()+s.getName());
        }



    }
}
