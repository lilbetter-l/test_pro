package ouc11.li04;

import java.awt.*;
import java.awt.event.*;

public class Menu {
    Frame frame = new Frame("测试菜单选项");
    //创建菜单条
    MenuBar menuBar = new MenuBar();
    //创建菜单组件
    java.awt.Menu filemenu = new java.awt.Menu("文件");
    java.awt.Menu editmenu = new java.awt.Menu("编辑");
    java.awt.Menu formatmenu = new java.awt.Menu("格式");
    //菜单项组件
    MenuItem auto = new MenuItem("自动换行");
    MenuItem copy = new MenuItem("复制");
    MenuItem paste = new MenuItem("粘贴");

    MenuItem comment = new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem cancelcomment = new MenuItem("取消注释");

    TextArea ta = new TextArea(6,50);



    public void init(){
        //组装视图
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("你真棒！！！");
            }
        });

        formatmenu.add(comment);
        formatmenu.add(cancelcomment);
        //组装编辑菜单
        editmenu.add(auto);
        editmenu.add(copy);
        editmenu.add(paste);
        editmenu.add(formatmenu);
        //组装菜单条
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        //把菜单条放在frame里面
        frame.setMenuBar(menuBar);
        frame.add(ta);

        //关掉窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Menu().init();

    }
}
