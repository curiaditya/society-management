package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SocietyManagement extends JFrame implements ActionListener {

    SocietyManagement(){
        setBounds(200,60,1000,600);

        ImageIcon i1= new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\society.jpg");
        Image i2= i1.getImage().getScaledInstance(1000,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1= new JLabel(i1);
        l1.setBounds(0,0,1000,600);
        add(l1);

        JLabel l2=new JLabel("Society Management System");
        l2.setFont(new Font("sarif",Font.BOLD,28));
        l2.setBounds(17,60,1000,50);
        l2.setForeground(Color.orange);
        l1.add(l2);

        JButton b1=new JButton("NEXT");
        b1.setBounds(750,450,120,40);
        b1.setFont(new Font("sarif",Font.BOLD,30));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.gray);
        b1.addActionListener(this);
        l1.add(b1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        SocietyManagement si= new SocietyManagement();
    }
    public void actionPerformed(ActionEvent e) {
        new Home().setVisible(true);
        this.setVisible(false);
    }
}

