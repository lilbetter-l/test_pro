package ouc11.li03;

import javax.swing.*;
import java.awt.*;

public class Component {
    Frame frame = new Frame("这里测试基本组件");
    TextArea ta = new TextArea(5,20);
    Choice co = new Choice();
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("男",checkboxGroup,true);
    Checkbox female = new Checkbox("男",checkboxGroup,false);
    Checkbox ismarried = new Checkbox("是否已婚");
    TextField textField = new TextField(20);
    Button button = new Button("确认");
    List colorlist = new List(6,true);
    public void init(){
        //组装界面
        //组装底部
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(textField);
        horizontalBox.add(button);
        frame.add(horizontalBox,BorderLayout.SOUTH);
        co.add("1");
        co.add("2");
        co.add("3");

        //组装选择部分
        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(co);
        horizontalBox1.add(female);
        horizontalBox1.add(male);
        horizontalBox1.add(ismarried);

        Box topleft = Box.createVerticalBox();
        topleft.add(ta);
        topleft.add(horizontalBox1);
        colorlist.add("1");
        colorlist.add("2");
        colorlist.add("3");

        Box top = Box.createHorizontalBox();
        top.add(topleft);
        top.add(colorlist);
        frame.add(top);
        frame.pack();
        frame.setVisible(true);


    }
     public static void main(String[] args) {
        new Component().init();


    }
}
