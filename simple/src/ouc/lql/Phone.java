package ouc.lql;
//类的定义
//this代表所在对象类的调用，解决局部变量隐藏成员变量
public class Phone {
        //成员变量
        String brand;
        private int age;
        //提供get 和set方法
        public void setAge(int a){
            if (a<0){
                System.out.println("年龄不能为负数");
            }else{
                age = a;
            }
    }
    public int getAge(){
            return age;
    }
        public void show(){
            System.out.println(brand+","+age);
        }
 }
