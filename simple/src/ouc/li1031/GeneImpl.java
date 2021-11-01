package ouc.li1031;

public class GeneImpl<T> implements Gene<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
