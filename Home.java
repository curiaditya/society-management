package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5;
    Home()
    {
        setTitle("Society Management System");
        setBounds(0,0,1920,1080);
        ImageIcon i1= new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\ele-2.jpg");
        Image i2= i1.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0,0,1920,1080);
        add(l1);

        b1=new JButton("  HOME  ");
        b1.setBounds(40,30,100,35);
        b1.setFont(new Font("sarif",Font.BOLD,12));
        b1.setForeground(Color.white);
        b1.setBackground(Color.gray);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("INFORMATION");
        b2.setBounds(170,30,120,35);
        b2.setFont(new Font("sarif",Font.BOLD,12));
        b2.setForeground(Color.white);
        b2.setBackground(Color.gray);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("ADMIN");
        b3.setBounds(1150,30,120,35);
        b3.setFont(new Font("sarif",Font.BOLD,12));
        b3.setForeground(Color.white);
        b3.setBackground(Color.gray);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("MEMBER");
        b4.setBounds(1300,30,120,35);
        b4.setFont(new Font("sarif",Font.BOLD,12));
        b4.setForeground(Color.white);
        b4.setBackground(Color.gray);
        b4.addActionListener(this);
        l1.add(b4);

        b5=new JButton("CONTACT");
        b5.setBounds(320,30,120,35);
        b5.setFont(new Font("sarif",Font.BOLD,12));
        b5.setForeground(Color.white);
        b5.setBackground(Color.gray);
        b5.addActionListener(this);
        l1.add(b5);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {

        }
        if(e.getSource()==b2)
        {

        }
        if(e.getSource()==b3)
        {
            LoginPage al=new LoginPage("Admin Login");
            //this.setVisible(false);
        }
        if(e.getSource()==b4)
        {
            LoginPage ml=new LoginPage("Member Login");
            //this.setVisible(false);
        }
        if(e.getSource()==b5)
        {

        }

    }
}
