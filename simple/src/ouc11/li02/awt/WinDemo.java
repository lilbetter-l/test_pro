package ouc11.li02.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinDemo {
    public static void main(String[] args) {
       // showWin();
       // showPanel();
        //showscropanel();
        //showlayout();
        //showborderlayout();
        //showGridLayout();
        //showcardlayout();
        //showboxlayout();
        showBox2();
    }

    //创建一个windows对象
    public static void showWin(){
        //1.创建一个窗口对象
        Frame frame = new Frame("这里测试windows窗口");
        //2.指定窗口的大小和位置
        frame.setLocation(100,100);
        frame.setSize(500,500);
        //3.设置窗口对象可见
        frame.setVisible(true);
    }
    //创建一个panel对象，不能单独存在，需要配合windows使用
    public static void showPanel(){

        //1.创建一个windows 对象，因为panel容器不能单独存在，需要先创建一个windows对象
        Frame frame = new Frame("这里演示paneldemo");
        //2.创建一个panel对象
        Panel p = new Panel();

        //3.创建一个文本框和按钮，放入到容器中
        p.add(new TextField("这里是一个测试文本"));
        p.add(new Button("这里是一个测试按钮"));
        //4.panel放在windows 里面
        frame.add(p);
        //5.设置windows的大小和位置
        frame.setBounds(100,100,500,500);
        //6.设置windows可见
        frame.setVisible(true);

    }
    public static void showscropanel(){
        Frame frame = new Frame("测试scropanel");
        ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        scrollPane.add(new TextField("test"));
        scrollPane.add(new Button("test"));
        frame.add(scrollPane);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);

    }
    public static void showlayout(){
        Frame frame = new Frame("这是测试的demo");
        //设置容器的布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+i));

        }
        //添加多个按钮到frame里面
        //设置最佳大小，就不设置大小和位置啦
        frame.pack();
        //frame.setBounds(100,100,500,500)
        frame.setVisible(true);
    }
    public static void showborderlayout(){
        Frame frame = new Frame("这里是测试borderlayout布局");
        frame.setLayout(new BorderLayout(30,30));
        frame.add(new Label("hello"));
        //往frame的指定区域添加按钮
        frame.add(new Button("按钮"),BorderLayout.NORTH);
        frame.add(new Button("按钮"),BorderLayout.EAST);
        frame.add(new Button("按钮"),BorderLayout.SOUTH);
        frame.add(new Button("按钮"),BorderLayout.WEST);
        frame.add(new Button("按钮"),BorderLayout.CENTER);
        frame.add(new TextField("文本框！"));
        Panel p = new Panel();
        p.add(new Button("annuity"));
        p.add(new TextField("ceshi"));
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
    public static void showGridLayout(){
        Frame frame = new Frame("计算器");
        //1.创建一个panel对象，里面放一个tet对象
        Panel p = new Panel();
        p.add(new TextField(30));

        //2.把当前这个panel添加到frame的北边区域
        frame.add(p,BorderLayout.NORTH);
        //3.创建一个panel对象，设置它的布局管理器为gridlayout
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i+""));

        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));


        //4.往panel里面添加内容
        frame.add(p2);

        //5.把当前panel组件添加到frame里面
        frame.pack();
        frame.setVisible(true);
    }

    public static void showcardlayout(){
        Frame frame = new Frame("卡片布局");
        Panel p = new Panel();
        CardLayout cardLayout = new CardLayout();
        p.setLayout(cardLayout);
        String[] names = {"第一张","第二张","第三张","第四张","第五张"};
        for (int i = 0; i < names.length; i++) {
            p.add(names[i],new Button(names[i]));
        }
        frame.add(p);
        Panel p2 = new Panel();
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand){
                    case "上一张":
                        cardLayout.previous(p);
                        break;
                    case "下一张":
                        cardLayout.next(p);
                        break;
                    case "第一张":
                        cardLayout.first(p);
                        break;
                    case "最后一张":
                        cardLayout.last(p);
                        break;
                    case "第三张":
                        cardLayout.show(p,"第三张");
                        break;

                }
            }
        };
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        frame.add(p2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    public static void showboxlayout(){
        Frame frame = new Frame("盒子布局");
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));
        frame.pack();
        frame.setVisible(true);
    }
    public static void showBox(){
        Frame frame = new Frame("box布局");
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("按钮1"));
        horizontalBox.add(new Button("按钮2"));
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("按钮3"));
        verticalBox.add(new Button("按钮4"));
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static void showBox2(){
        Frame frame = new Frame("加强版的box容器");
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("1"));
        //在两个方向都可以拉伸
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(new Button("2"));
        horizontalBox.add(Box.createHorizontalStrut(30));
        horizontalBox.add(new Button("3"));

        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("4"));
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(new Button("5"));
        verticalBox.add(Box.createVerticalStrut(30));
        verticalBox.add(new Button("6"));
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox);
        frame.pack();
        frame.setVisible(true);
    }
}
