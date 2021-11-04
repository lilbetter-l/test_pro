package ouc11.li04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Filedialog {
    public static void main(String[] args) {
        Frame frame = new Frame("打开文件对话框！");
        //创建两个filedialog对话框
        FileDialog openfile = new FileDialog(frame,"选择要打开的文件",FileDialog.LOAD);
        FileDialog savefile = new FileDialog(frame,"选择要保存的文件",FileDialog.SAVE);
        Button b1 = new Button("open file");
        Button b2 = new Button("save file");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openfile.setVisible(true);
                String directory = openfile.getDirectory();
                String file = openfile.getFile();
                System.out.println("open path"+directory);
                System.out.println("open name"+file);

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savefile.setVisible(true);
                String directory = savefile.getDirectory();
                String file = savefile.getFile();
                System.out.println("save path"+directory);
                System.out.println("save name"+file);
            }
        });

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);

        //创建俩个按钮
        //给这俩个按钮设置点击后的行为
        //把按钮添加到frame里面
        frame.pack();
        frame.setVisible(true);
    }
}
