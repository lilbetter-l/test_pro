package ouc11.li02;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\lql\\Desktop\\hello.txt");
        System.out.println(f.delete());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        File f2 = new File("C:\\Users\\lql\\Desktop");
        System.out.println(f2.mkdir());
        File f3 = new File("C:\\Users\\lql\\Desktop\\lql\\hello\\world");
        System.out.println(f3.mkdirs());
        System.out.println("下面的是新的一节的内容！");
        File f4 = new File("li01\\lql");
        System.out.println(f4.isDirectory());
        System.out.println(f4.isFile());
        System.out.println(f4.exists());
        System.out.println(f4.getAbsolutePath());
        System.out.println(f4.getName());
        System.out.println(f4.getPath());
        String[] strings = f2.list();
        for (String s:strings){
            System.out.println(s);
        }

        File[] listFiles = f2.listFiles();
        for (File file: listFiles
             ) {
            System.out.println(file);
        }




    }
}
