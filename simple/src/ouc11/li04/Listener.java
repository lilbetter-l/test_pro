package ouc11.li04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener {

    Frame frame = new Frame("这里测试事件");
    //事件源
    TextField  tf = new TextField("30");
    Button b1 = new Button("点我呀！");
    //监听
    public class mylistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("我被点击了，咋办呀！！！！");
            tf.setText("hello,world!");
        }
    }
    public void init(){
        mylistener mylistener = new mylistener();
        //注册监听
        b1.addActionListener(mylistener);
        //放在容器里面
        frame.add(tf,BorderLayout.NORTH);
        frame.add(b1);
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Listener().init();

    }
}
