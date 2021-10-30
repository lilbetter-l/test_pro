package ouc.lql;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraytest1 {
    public static void main(String[] args) {

       //show();
        ArrayList<Student1> array = new ArrayList<>();
        show_1(array);
        show_1(array);
        show_1(array);
        for (int x =0;x<array.size();x++){
            Student1 stu = array.get(x);
            System.out.println(stu.getAge()+","+stu.getName());
        }
    }
    public static void show(){
        ArrayList<Student1> array = new ArrayList<>();
        Student1 stu = new Student1("lql",24);
        Student1 stu2 = new Student1("love",24);
        Student1 stu3 = new Student1("hello",24);

        array.add(stu);
        array.add(stu2);
        array.add(stu3);

        for (int  i =0;i<array.size();i++){
            Student1 s = array.get(i);
            System.out.println(s.getAge()+s.getName());
        }
    }


    public static void show_1(ArrayList<Student1> array){

        Scanner sc = new Scanner(System.in);
        System.out.println("please input a name:");
        String name = sc.nextLine();
        System.out.println("please input a age:");
        int age = sc.nextInt();

        //创建学生对象
        Student1 stu = new Student1();
        stu.setAge(age);
        stu.setName(name);
        array.add(stu);
    }
}
