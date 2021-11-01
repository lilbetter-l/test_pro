package ouc.li1031;

import java.util.ArrayList;
import java.util.List;

public class GeneDemo {
    public static void main(String[] args) {
        Gene<String> g1 = new GeneImpl<>();
        g1.show("lql");

        List<?> list = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        System.out.println("``````````````````````````");
        List<? extends Number> list3  = new ArrayList<Number>();
        List<? super Number> list4 = new ArrayList<Number>();
        System.out.println(sum(10,20,30));

    }
    public static int sum(int... a){
        int sum =0;
        for (int i :a
             ) {
            sum+=i;
        }
        return sum;
    }
}
