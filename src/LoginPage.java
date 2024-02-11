import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(700,500);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        JLabel lb1 = new JLabel("User Name");
        JLabel lb2 = new JLabel("Password");
        JLabel lb3 =new JLabel("If you are Existing User");
        lb1.setBounds(200,100,100,30);
        lb2.setBounds(200,150,100,30);
        lb3.setBounds(300,50,400,30);
        JLabel lb4 =new JLabel("If you are new User click on SignUp");
        lb4.setBounds(300,250,400,30);
        jf.add(lb4);
        jf.add(lb1);
        jf.add(lb2);
        jf.add(lb3);
        JTextField userName = new JTextField();
        JPasswordField password = new JPasswordField();
        userName.setBounds(300,100,200,30);
        password.setBounds(300,150,200,30);
        jf.add(userName);
        jf.add(password);
        password.setEchoChar('*');
        JButton b1 =new JButton("Submit");
        JButton b2 =new JButton("Reset");
        b1.setBounds(250,200,100,30);
        b2.setBounds(400,200,100,30);
        jf.add(b1);
        jf.add(b2);
        JButton b3 =new JButton("SignUp");
        b3.setBounds(250,300,100,30);
        jf.add(b3);
        //Action Listener
        ActionListener al =ae->{
            if(ae.getSource()==b1){
                userName.setEditable(false);
                password.setEditable(false);
            }
            else if(ae.getSource()==b2){
                userName.setText(null);
               password.setText(null);
               userName.setEditable(true);
               password.setEditable(true);
            }
        };
        b1.addActionListener(al);
        b2.addActionListener(al);

        jf.getContentPane().setBackground(Color.cyan);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
