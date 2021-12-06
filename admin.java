package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame {
    Container c;
    JMenuBar menu1;
    JMenu file1,file2,file3,file4,file5;
    JMenuItem m1,m2,m3,m4;
    JMenuItem b1,b2;
    JMenuItem e1,e2;
    JMenuItem log1,log2;
    JMenuItem fb1,fb2;
    JLabel l1,l2,l3,l4;
    Admin()
    {
        c=this.getContentPane();
        c.setLayout(null);
        setTitle("Admin");
        setBounds(0,0,1920,1080);
        c.setBackground(Color.LIGHT_GRAY);

        ImageIcon i1=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\admin4.jpg");
        Image i2=i1.getImage().getScaledInstance(400,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
        l1.setBounds(0,0,400,150);
        c.add(l1);

        ImageIcon i4=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\admin5.jpg");
        Image i5=i4.getImage().getScaledInstance(400,150,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l2=new JLabel(i6);
        l2.setBounds(400,0,400,150);
        c.add(l2);

        ImageIcon i7=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\admin6.jpg");
        Image i8=i7.getImage().getScaledInstance(400,150,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        l3=new JLabel(i9);
        l3.setBounds(800,0,400,150);
        c.add(l3);

        ImageIcon i10=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\admin4.jpg");
        Image i11=i10.getImage().getScaledInstance(400,150,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        l4=new JLabel(i12);
        l4.setBounds(1200,0,400,150);
        c.add(l4);

        Font f1=new Font("BelL MT",Font.BOLD,20);

        menu1 =new JMenuBar();
        menu1.setBounds(0,150,1920,40);
        menu1.setBackground(Color.darkGray);
        file1=new JMenu("   Member      ");
        file2=new JMenu("   Bill          ");
        file3=new JMenu("  Event         ");
        file4=new JMenu("Feedback      ");
        file5=new JMenu("    Logout    ");
        file1.setForeground(Color.WHITE);
        file2.setForeground(Color.WHITE);
        file3.setForeground(Color.WHITE);
        file4.setForeground(Color.WHITE);
        file5.setForeground(Color.WHITE);
        file1.setFont(f1);
        file2.setFont(f1);
        file3.setFont(f1);
        file4.setFont(f1);
        file5.setFont(f1);
        menu1.add(file1);
        menu1.add(file2);
        menu1.add(file3);
        menu1.add(file4);
        menu1.add(file5);
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        menu1.setCursor(cur);
        c.add(menu1);

        m1=new JMenuItem("Add Member");
        m2=new JMenuItem("Member List");
        m3=new JMenuItem("Edit Details");
        m4=new JMenuItem("Remove Member");
        m1.setFont(f1);
        m2.setFont(f1);
        m3.setFont(f1);
        m4.setFont(f1);
        m1.setForeground(Color.WHITE);
        m2.setForeground(Color.WHITE);
        m3.setForeground(Color.WHITE);
        m4.setForeground(Color.WHITE);
        m1.setBackground(Color.darkGray);
        m2.setBackground(Color.darkGray);
        m3.setBackground(Color.darkGray);
        m4.setBackground(Color.darkGray);
        file1.add(m1);
        file1.add(m2);
        file1.add(m3);
        file1.add(m4);

        b1=new JMenuItem("Bill Charges");
        b2=new JMenuItem("Bill Paid List");
        b1.setFont(f1);
        b2.setFont(f1);
        b1.setBackground(Color.DARK_GRAY);
        b2.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        file2.add(b1);
        file2.add(b2);

        e1=new JMenuItem("Create Event");
        e2=new JMenuItem("Show Event");
        e1.setFont(f1);
        e2.setFont(f1);
        e1.setBackground(Color.DARK_GRAY);
        e2.setBackground(Color.DARK_GRAY);
        e1.setForeground(Color.WHITE);
        e2.setForeground(Color.WHITE);
        file3.add(e1);
        file3.add(e2);

        log1=new JMenuItem("      Logout");
        log2=new JMenuItem("Change Password");
        log1.setFont(f1);
        log2.setFont(f1);
        log1.setBackground(Color.DARK_GRAY);
        log2.setBackground(Color.DARK_GRAY);
        log1.setForeground(Color.WHITE);
        log2.setForeground(Color.WHITE);
        file5.add(log1);
        file5.add(log2);

        fb1=new JMenuItem("Received");
        fb2=new JMenuItem("Reply");
        fb1.setFont(f1);
        fb2.setFont(f1);
        fb1.setBackground(Color.DARK_GRAY);
        fb2.setBackground(Color.DARK_GRAY);
        fb1.setForeground(Color.WHITE);
        fb2.setForeground(Color.WHITE);
        file4.add(fb1);
        file4.add(fb2);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Admin();
    }
}
