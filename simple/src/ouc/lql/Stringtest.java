package ouc.lql;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Stringtest {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please input a string");
        String line = sc.nextLine();
        for (int x = 0;x<line.length();x++){
            System.out.println(line.charAt(x));
        }*/

        count();

    }


    //下面的是统计字符出现的次数

    public static void count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string:");
        String line = sc.nextLine();
        int bigCount = 0;
        int samllCount = 0;
        int numberCount = 0;
        for (int i = 0;i<line.length();i++){
            char ch = line.charAt(i);
            if (ch>'A'&& ch<'Z'){
                bigCount++;
            }else if(ch>'a'&&ch<'z'){
                samllCount++;
            }else if(ch>'0'&&ch<'9'){
                numberCount++;
            }
        }
        System.out.println("大写"+bigCount);
        System.out.println("小写"+samllCount);
        System.out.println("数字"+numberCount);

    }

    //下面使用拼串的方式实现

}



