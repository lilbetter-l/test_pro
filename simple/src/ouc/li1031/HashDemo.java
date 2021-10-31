package ouc.li1031;

import ouc.li1030.Stu_Collection.Stu;

import java.util.HashSet;

public class HashDemo {
    public static void main(String[] args) {
        //创建一个学生对象
        Stu s1 = new Stu("lql", 24);
        Stu s2 = new Stu("love", 24);
        Stu s3 = new Stu("me", 24);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("simple".hashCode());

        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        for (String s : hs
        ) {
            System.out.println(s);
        }

        System.out.println("下面的是学生类的遍历操作");
        HashSet<Stu> hashSet = new HashSet<Stu>();
        Stu s11 = new Stu("lql", 24);
        Stu s12 = new Stu("lql2", 24);
        Stu s13 = new Stu("lql3", 24);
        Stu s14 = new Stu("lq4", 24);
        hashSet.add(s11);
        hashSet.add(s12);
        hashSet.add(s13);
        hashSet.add(s14);
        for (Stu s :hashSet
             ) {
            System.out.println(s.getAge()+s.getName());
        }
    }


}
