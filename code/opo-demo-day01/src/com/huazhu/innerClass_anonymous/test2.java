package com.huazhu.innerClass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class test2 {
    public static void main(String[] args) {
        //����
        JFrame win =new JFrame("��¼����");
        //����
        JPanel jPanel =new JPanel();
        win.add(jPanel);
        JButton button = new JButton("��¼");

       /* button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"�ұ������");
            }
        });
*/
        button.addActionListener( e-> JOptionPane.showMessageDialog(win,"�ұ������"));

        jPanel.add(button);
        win.setSize(400,600);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
