package ouc11.li04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenDemo {
    Frame frame = new Frame("这里测试各种的事件和监听器！");
    TextField textField=  new TextField();
    Choice choice = new Choice();


    public void init(){
        choice.add("lql");
        choice.add("love");
        choice.add("china");
        textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = textField.getText();
                System.out.println("当前文本框中的内容为："+text);
            }
        });
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println("当前选中的条目为："+item);
            }
        });
        frame.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println("当前frame里面添加了"+child);
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(choice);
        horizontalBox.add(textField);
        frame.add(horizontalBox);

        frame.setBounds(100,100,500,500);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ListenDemo().init();

    }
}
