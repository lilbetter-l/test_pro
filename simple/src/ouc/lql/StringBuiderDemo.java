package ouc.lql;

import java.util.Scanner;

public class StringBuiderDemo {
    public static void main(String[] args) {


      /*  StringBuilder sb = new StringBuilder("lql");
        StringBuilder sb2 = sb.append("gwq");
        System.out.println(sb2);
        System.out.println(sb);
        System.out.println(sb==sb2);
        System.out.println(sb.length());
        System.out.println(sb.reverse());

        String s = sb.toString();
        System.out.println(s);
        String s1 = "happy";
        StringBuilder sb3 = new StringBuilder(s1);
        System.out.println(sb3);

        System.out.println("下面的是凭借字符串");
        */

        /*int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string:");
        String line = sc.nextLine();
        String s = arrayAverse(line);
        System.out.println(s);



    }

    //  字符串拼接升级版
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                sb.append(arr[x]);
            } else {
                sb.append(arr[x] + ",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }

    //下面的是字符串反转的实现
    public static String arrayAverse(String s){
        StringBuilder sb =new StringBuilder(s);
        String s1 = sb.reverse().toString();
        return s1 ;
    }

}
