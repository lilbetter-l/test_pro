package ouc11.li02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleimgio {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lql\\Desktop\\cat.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lql\\Desktop\\cat2.jpg");
        byte[] bye = new byte[1023];
        int len = fis.read(bye);
        while(len!=-1){
            fos.write(bye,0,len);
        }




    }

}
