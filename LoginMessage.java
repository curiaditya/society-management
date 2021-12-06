package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMassage implements ActionListener {
    JFrame f;
    Container c;
    JLabel l;
    JButton btn;
    LoginMassage(String str)
    {
        f=new JFrame();
        c=f.getContentPane();
        f.setTitle("Login");
        c.setLayout(null);
        c=f.getContentPane();
        f.setBounds(600,300,350,200);

        l=new JLabel(str);
        Font fo=new Font("Arial",Font.BOLD,20);
        l.setFont(fo);
        l.setBounds(20,30,200,25);
        c.add(l);

        btn=new JButton();
        btn.setText("OK");
        btn.setFont(fo);
        btn.setBounds(140,80,65,30);
        c.add(btn);
        btn.addActionListener(this);

        f.setVisible(true);
    }


    //public static void main(String[] args) {
       // new LoginMassage();
  //  }

    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
    }
}
