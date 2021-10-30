package ouc.li1029;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Ldate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        //从data到string
        Date dd = new Date();
        SimpleDateFormat ss  = new SimpleDateFormat();
        String format = ss.format(dd);
        System.out.println(format);

    }
}