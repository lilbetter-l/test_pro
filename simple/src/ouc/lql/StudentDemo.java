package ouc.lql;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(24);
        s1.setName("lql");
        s1.show();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //使用带参的构造方法创建有属性值的对象
        Student s2 = new Student("lql",24);
        s2.show();
    }
}




//api 应用程序编程接口,java api

