package ouc.scoremannger;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        //用输出语句实现界面的编写
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    showStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//虚拟机退出
            }

        }

    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所以需要的数据，显示提示信息，提示需要输入何种信息
        Scanner sc = new Scanner(System.in);
        //为了让sid 在while可以使用，我们可以把它定义在循环外
        String sid;
        //为了让程=程序可以回到这里，我们可以使用循环实现
        while (true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array,sid);
            if (flag){
                System.out.println("你输入的学号已经被占用，请从新输入：");
            }
            else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setAddress(address);
        s.setAge(age);
        s.setName(name);
        //把学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("学生添加成功！");
    }
    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag=false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //定义一个方法，实现查看所有学生信息
    public static void showStudent(ArrayList<Student> array) {
        //先判断是否有数据，如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息在查询！");
            //为了不让程序继续像下面执行，给一个分号
            return;
        }
        //显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        //将集合中的数据取出来，按照对应的格式显示学上信息
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t"
                    + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入：");
        } else {
            //通过索引删除学生信息
            array.remove(index);
            System.out.println("删除学生成功！");
        }



    }

    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号：");
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入学生的新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAddress(address);
        s.setAge(age);
        //遍历集合修改学生信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;

            }
        }
        //给出修改成功的提示
        System.out.println("修改学生信息成功！");


    }

}
