package ouc.li1030.Stu_List;

import ouc.li1030.Stu_Collection.Stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stu_list {
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<Stu>();
        Stu s1 = new Stu("lql",24);
        Stu s2 = new Stu("is",24);
        Stu s3 = new Stu("better",24);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Iterator<Stu> it = list.iterator();
        while (it.hasNext()){
            Stu s = it.next();
            System.out.println(s.getAge()+s.getName());
        }
        System.out.println("另一种遍历的方式操作");
        for (int i=0;i<list.size();i++){
            Stu s = list.get(i);
            System.out.println(s.getAge()+s.getName());
        }
        System.out.println("下面时使用别的方式来实现的！！");
        for (Stu s:list
             ) {
            System.out.println(s.getAge()+s.getName());
        }

    }
}
