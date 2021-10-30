package ouc.lql;


import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("please input first number:");
        int a = sc.nextInt();
        System.out.println("please input second number:");
        int b = sc.nextInt();
        int max = getmax(a,b);
        System.out.println("max="+max);*/

        /*Scanner sc  =new Scanner(System.in);

        System.out.println("please input a number(1-7):");
        int a = sc.nextInt();
        printplan(a);*/



        /*//下面的是每逢7就过的数据
        for (int x =0;x<=100;x++){
            if (x%10==7 || x/10%10==7||x==7){{
                System.out.println(x);}
            }
        }*/

        //下面是不死兔子的问题
        /*int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int x= 2;x<arr.length;x++){

            arr[x] = arr[x-1]+arr[x-2];

        }
        System.out.println(arr[19]);*/

        int[] arr = {1,22,33,56};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int flag = -1;
        for (int x = 0;x<arr.length;x++){
            if (input==arr[x]){
                flag=x;
            }
        }
        System.out.println(flag);




    }
    public static int getmax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void printplan(int a){
        switch (a){

            case 1:
                System.out.println("游泳");
                break;
            case 2:
                System.out.println("爬山");
                break;
            case 3:
                System.out.println("拳击");
                break;
            case 4:
                System.out.println("瑜伽");
                break;
            case 5:
                System.out.println("单车");
                break;
            case 6:
                System.out.println("健身");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你输的数据有错误！！！");
        }





    }
}
