package ouc11.li02;

import java.io.File;

public class DiGui {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println("5的阶乘是:"+result);

        System.out.println("下面的是遍历输出文件目录");
        File f = new File("C:\\Users\\lql\\Desktop");
        getAllFilePath(f);



    }
    public static int jc(int n){
        if(n == 1){
            return 1;
        }else{
            return n * jc(n-1);
        }
    }
    public static void getAllFilePath(File srcFile){
        File[] files = srcFile.listFiles();
        if (files != null){
            for (File file: files
             ) {
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}

