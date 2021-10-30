package ouc.lql;
import java.util.Scanner;
import java.util.Random;

public class metthod {
    public static void main(String[] args) {
        //调用方法,在main方法里面进行调用，因为main方法是程序的入口方法


       // isevennumber();
//         maxnum(1,2);

//        name("liqilun");
      /*  boolean flag = isnumer(10);
        System.out.println(flag);*/
       /* int result = getmax(20,10);
        System.out.println(result);*/
       /* int result = sum(10,10,3);
        System.out.println(result);*/
//        System.out.println(compare((byte)23,(byte)1));
//        int[] arr = {11,22,33,44,55};
//        printarr(arr);
        int[] arr = {1,2,55,2323,11111,1132434};
        System.out.println(getmax(arr));


    }
    //定义方法
    public  static void isevennumber(){
        int[] a ={1,2,3};
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number:");
        int number=sc.nextInt();
        Random rand = new Random();
        int randnum   = rand.nextInt(10);
        System.out.println(randnum);
        if(number%2 == 0){
            System.out.println("是偶数");
        }else{
            System.out.println("不是偶数");
        }
    }
    public static void maxnum(int a,int b){
        System.out.println("俩者中较大的数值是：");
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    //下面是带参数的方法的定义和调用
    public  static  void name(String name){
        System.out.println("your name is :"+name);
    }
    //带返回值的方法的定义
    public static boolean isnumer(int number){
        if (number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static int getmax(int a,int b){
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }

    //方法重载，和返回值关系不大，主要看方法名和参数类型
    public static int sum1(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static boolean compare(int a,int b){
        return a == b;
    }
    //数组遍历

    public static void printarr(int[] arr){
             System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);

            }else{
                System.out.print(arr[i]+", ");
            }



        }
        System.out.println("]");


    }

    //数组中的最大值
    public static int getmax(int[] arr){
        int max = arr[0];
        for (int x =1;x<arr.length;x++){
            if (arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }




}

