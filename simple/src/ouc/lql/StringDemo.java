package ouc.lql;

import java.util.Scanner;

/*
 * 字符串地址比较使用的是==，内容比较使用的是equals（）
 * */
public class StringDemo {
    public static void main(String[] args) {
        /*String s1 = new String();
        System.out.println(s1);;
        char[] arr ={'a','b','c'};
        String s2 = new String(arr);
        System.out.println(s2);
        String s3 = "lql";//推荐使用这种方式
        System.out.println(s3);*/
        String username = "lql";
        String pwd = "lql";
        for (int x = 0; x < 3; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input username");
            String name = sc.nextLine();
            System.out.println("please input pwd");
            String pwd1 = sc.nextLine();
            if (name.equals(username) && pwd1.equals(pwd)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - x == 0) {
                    System.out.println("你的账户被锁定，请联系管理员进行操作！！！");
                } else {
                    System.out.println("登陆失败，你还有" + (x - 2) + "次机会!");
                }
            }

        }
    }
}
