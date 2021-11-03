package ouc11.li02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOprator {
    public static void main(String[] args) throws IOException {
   /*     FileOutputStream fos = new FileOutputStream("C:\\Users\\lql\\Desktop\\simple.txt");
        //将指定的字节输入此文件
        fos.write(97);
        fos.write(59);
        for (int i = 0; i < 10; i++) {

            byte[] bys = {97,98,99,100};
            fos.write(bys);
        }
        //最后要释放资源
        fos.close();*/

        FileInputStream fis = new FileInputStream("C:\\Users\\lql\\Desktop\\simple.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lql\\Desktop\\simple2.txt");
        int by = fis.read();
/*        while (by != -1){
            System.out.print((char)by);
            by = fis.read();
        }*/
        //判断读取到的数据是否是-1
        while ((by= fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
