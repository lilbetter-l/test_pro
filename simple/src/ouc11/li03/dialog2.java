package ouc11.li03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialog2 {


    public static void main(String[] args) {
        Frame frame = new Frame("这里测试dialog");
        Dialog dialog = new Dialog(frame, "1", true);
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new TextField("hello"));
        verticalBox.add(new Button("button"));
        dialog.add(verticalBox);

        dialog.setBounds(20,20,300,300);

        Button model1 = new Button("open the model1");

        model1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        frame.add(model1, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }
}
