package ouc11.li03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialog {


    public static void main(String[] args) {
        Frame frame = new Frame("这里测试dialog");
        Dialog dialog = new Dialog(frame, "1", true);
        Dialog dialog2 = new Dialog(frame, "2", false);
        dialog.setBounds(20,20,300,300);
        dialog2.setBounds(20,20,300,300);
        Button model1 = new Button("open the model1");
        Button model2 = new Button("open the model2");
        model1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        model2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });
        frame.add(model1, BorderLayout.NORTH);
        frame.add(model2);
        frame.pack();
        frame.setVisible(true);
    }
}
