package ouc.lql;


import java.util.Scanner;

/*
* 需求：
* 定义一个方法，实现字符反转，键盘录入一个字符串，调用该方法后，在控制台输出结果‘
* 列如：键盘录入abc，输出结果cba
*
* 思路：
* 1.键盘录入一个字符串，用Scanner实现
* 2.定义一个方法，实现字符串反转，返回值类型String ,参数String s
* 3.在方法中把字符串到这遍历，然后把每一个得到的字符串平成一个字符串返回
* 4.调用方法，用一个变量接收结果
* 5.输出结果
*
*
*
* */
public class Stringaverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string");
        String line = sc.nextLine();
        String s = arraverse(line);
        System.out.println(s);


    }
    public static String arraverse(String ss){
        String s="";
        s+="[";
        for (int x = ss.length()-1;x>=0;x--){
            s+=ss.charAt(x);
        }
        s+="]";
        return s;
    }
}
