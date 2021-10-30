package ouc.JiCheng;
/*手机测试类*/
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p = new Phone();
        p.call("李奇伦");
        System.out.println("------------------");
        NewPhone n = new NewPhone();
        n.call("李奇伦");
    }
}
