package ouc.li1029;

import java.util.Arrays;

public class UseSort {
    public static void main(String[] args) {
        int[] arr = {32,44,64,123,53,13};
        System.out.println("排序前："+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序前："+Arrays.toString(arr));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2 = new Integer("100");
        System.out.println(i2);
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("1000");
        System.out.println(i4);
        int number = 100;
        String s = " "+number;
        System.out.println(s);
        String s2 = String.valueOf(number);
        System.out.println(s2);

        String s3 = "100";
        Integer i = Integer.valueOf(s3);
        int x = i.intValue();
        System.out.println(x);
        System.out.println();
        int i6 = Integer.parseInt(s);






    }
}
