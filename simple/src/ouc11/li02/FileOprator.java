package ouc11.li02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOprator {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lql\\Desktop\\simple.txt");
        //将指定的字节输入此文件
        fos.write(97);
        fos.write(59);
        byte[] bys = {97,98,99,100};
        byte[] bytes = "lql".getBytes();

        fos.write(bys);
        fos.write(bytes);
        //最后要释放资源
        fos.close();


    }
}
