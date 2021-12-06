package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginPage extends JFrame implements ActionListener {
    JFrame f;
    JTextField f1;
    JPasswordField f2;
    JButton btn1,btn2;
    Container c;
    LoginPage(String s)
    {
        c=this.getContentPane();
        setBounds(500,125,500,550);
        c.setLayout(null);
        setTitle(s);

        JTextField t1=new JTextField();
        t1.setBounds(70,180,350,30);
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setText(s);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setEditable(false);
        Font font1=new Font("Arial",Font.BOLD,20);
        t1.setFont(font1);
        c.add(t1);

        ImageIcon i1=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\loginIcon.png");
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(200,50,100,100);
        c.add(l);



        JLabel l1=new JLabel("Username");
        l1.setBounds(80,260,100,30);
        l1.setFont(font1);
        c.add(l1);

        f1=new JTextField();
        f1.setBounds(200,260,210,30);
        c.add(f1);

        JLabel l2=new JLabel("Password");
        l2.setBounds(80,310,100,30);
        l2.setFont(font1);
        c.add(l2);

        f2=new JPasswordField();
        f2.setBounds(200,310,210,30);
        c.add(f2);

        btn1=new JButton("Login");
        btn1.setBounds(180,370,160,30);
        c.add(btn1);
        btn1.addActionListener(this);

        btn2=new JButton("Cancel");
        btn2.setBounds(180,420,160,30);
        c.add(btn2);
        btn2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1)
        {
            String originaluser="",entereduser=f1.getText();
            String originalpass="",enteredpass=f2.getText();
            File obj=new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\login.txt");
            try {
                Scanner sc=new Scanner(obj);
                originaluser=sc.next();
                originalpass=sc.next();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            if(originaluser.equals(entereduser) && originalpass.equals(enteredpass)) {
                new LoginMassage("Login Successful !!!");
                this.setVisible(false);
            }
            else {
                new LoginMassage("Invalid - Enter Again");
                f1.setText("");
                f2.setText("");
            }
        }
        if(e.getSource()==btn2)
        {
            this.setVisible(false);
        }
    }
}
