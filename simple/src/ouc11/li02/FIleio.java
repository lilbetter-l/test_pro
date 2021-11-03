package ouc11.li02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleio {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lql\\Desktop\\simple.txt");
        FileInputStream fos = new FileInputStream("C:\\Users\\lql\\Desktop\\simple.txt");
   /*     byte[] bys = new byte[100];
        int len = fis.read();
        System.out.println(new String(bys,0,len));*/
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            System.out.println(new String(bys,0,len));
        }
        fis.close();
    }
}
