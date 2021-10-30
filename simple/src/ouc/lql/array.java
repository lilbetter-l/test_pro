package ouc.lql;

public class array {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        int[] arr = new int[3];
        /*
         * int 说明数组的原始类型是int类型
         * []这是一个数组
         * arr 这是一个数组的名称
         * new 为数组折你去哪个内存空间
         * 3 表示这是一个数组的长度，其实就是数组中元素的个数
         *
         * */
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[] arr2 = arr;
        arr2[1] = 11;
        arr2[2] = 22;
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("after");
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //以下内容是对数组的静态初始化操作
        int[] ori = new int[]{1,2,3};
        System.out.println(ori[1]);
        //以下的是简化格式操作
        int[] arr3 = {1,2,34,5,6};//定义数组
        System.out.println(arr3[2]);//输出数组中的元素

        //null,空值，表示不指向任何数据类型
        System.out.println(arr3[0]);

        //数组的遍历操作
        int[] arr4 = {11,22,33,44,55,66};
        for(int i=0; i<arr4.length;i++){
            System.out.println(i+"-------->"+arr4[i]);
        }
        //获取数组中的最大值
        int max = arr[0];
        for(int x = 1;x<arr4.length;x++){
            if(arr4[x]>max){
                max = arr4[x];
            }
        }
        System.out.println("最大值为"+max);



    }
}



