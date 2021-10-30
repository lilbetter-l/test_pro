package ouc.li1030.Stu_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Stu {
    public static void main(String[] args) {
        Collection<Stu> c = new ArrayList<Stu>();
        Stu s1 = new Stu("i", 32);
        Stu s2 = new Stu("love", 31);
        Stu s3 = new Stu("you", 30);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator<Stu> it = c.iterator();
        while (it.hasNext()){
            Stu s  = it.next();
            System.out.println(s.getAge()+s.getName());
        }
        System.out.println("使用增强for循环实现遍历操作");
        for (Stu s:c
             ) {
            System.out.println(s.getAge()+s.getName());
        }



    }
}
