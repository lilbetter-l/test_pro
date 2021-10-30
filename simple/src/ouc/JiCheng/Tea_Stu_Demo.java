package ouc.JiCheng;
/*
包名其实就是文件夹。有多级包的，要用.进行分开,其实就是一级一级的目录而已
* 测试类*/
public class Tea_Stu_Demo {
    //创建老师对象进行测试
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(24);
        t.setName("李奇伦");
        t.teach();
        System.out.println(t.getAge()+t.getName());

    }



}
