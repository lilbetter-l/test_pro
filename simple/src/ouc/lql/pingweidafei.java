package ouc.lql;


import java.util.Scanner;

public class pingweidafei {
    public static void main(String[] args) {
        //定义一个数组，用动态的初始化完成数组元素的赋值操作
        int[] arr = new int[6];
        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);

        for (int x =0;x<arr.length;x++){
            System.out.println("please input"+x+"个评委的分数：");
            arr[x] = sc.nextInt();
        }

        printarray(arr);
        int max = getmax(arr);
        int min = getmin(arr);
        int sum = getsum(arr);
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("选手的最终的分数："+avg);




    }
    //让数组元素用数组的形式及表现出来

    public  static void printarray(int[] arr){
        System.out.println("[");
        for (int x = 0;x<arr.length;x++){
            if (x == arr.length-1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");

    }
    //方法实现最高分数
    public  static  int getmax(int[] arr){
        int max = arr[0];
        for (int x = 1;x<arr.length;x++){
            if (arr[x] >max){
                max = arr[x];
            }
        }
        return max;
    }
    //俩个明确：
    //返回值类型和参数


    //方法实现最低分数
    public  static  int getmin(int[] arr){
        int min = arr[0];
        for (int x = 1;x<arr.length;x++){
            if (arr[x] <min){
                min = arr[x];
            }
        }
        return min;
    }
    //实现总分数
    public static int getsum(int[] arr){
        int sum = 0;
        for (int x =0;x<arr.length;x++){
            sum+=arr[x];
        }
        return sum;
    }
}
