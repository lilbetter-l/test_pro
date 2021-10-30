package ouc.lql;

public class Gouzaomethod {
    private String name;
    private int age;
    public Gouzaomethod(){
        System.out.println("无参构造方法！");
    }
    //构造方法也相当于一个方法的重载的过程，方法名相同，参数类型和变量不相同
    public Gouzaomethod(String name){
        this.name = name;

    }
    public Gouzaomethod(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+","+age);
    }

}

