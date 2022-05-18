package com.huazhu.innerClass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class test2 {
    public static void main(String[] args) {
        //窗口
        JFrame win =new JFrame("登录界面");
        //桌布
        JPanel jPanel =new JPanel();
        win.add(jPanel);
        JButton button = new JButton("登录");

       /* button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"我被点击了");
            }
        });
*/
        button.addActionListener( e-> JOptionPane.showMessageDialog(win,"我被点击了"));

        jPanel.add(button);
        win.setSize(400,600);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
