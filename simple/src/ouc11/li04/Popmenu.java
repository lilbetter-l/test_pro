package ouc11.li04;

import java.awt.*;
import java.awt.event.*;

public class Popmenu {
    Frame frame = new Frame("这里测试popmenu");
    TextArea textArea = new TextArea("我爱中华！",6,30);
    Panel p = new Panel();
    PopupMenu popupMenu = new PopupMenu();
    MenuItem comment = new MenuItem("注释");
    MenuItem cancelcomment = new MenuItem("取消注释");
    MenuItem copy = new MenuItem("复制");
    MenuItem save = new MenuItem("粘贴");






    public void init(){

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                textArea.append("你点击了:"+actionCommand);
            }
        };
        comment.addActionListener(listener);
        cancelcomment.addActionListener(listener);
        copy.addActionListener(listener);
        save.addActionListener(listener);
        popupMenu.add(comment);
        popupMenu.add(cancelcomment);
        popupMenu.add(copy);
        popupMenu.add(save);

        p.add(popupMenu);
        //设置popmenu大小
        p.setPreferredSize(new Dimension(400,400));

        //给panel注册鼠标点击事件，监听用户释放鼠标的动作，展示菜单
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();
                if (flag){
                    popupMenu.show(p, e.getX(), e.getY());
                }
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(textArea);
        frame.add(p,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Popmenu().init();

    }
}
