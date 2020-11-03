package Alisson_j01_MyRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    JPanel jp;
    JTextField userName_TestField;
    JPasswordField passwordField;
    JRadioButton male,female;
    ButtonGroup buttonGroup;
    JCheckBox h1,h2,h3,h4;
    JComboBox city;
    JTextArea words;
    JButton submit,cancel;
    JLabel userName_Label;
    JLabel password_Label;
    JLabel userSex;
    JLabel userHobbies;
    JLabel userCity;
    JLabel userWords;

    public Register() {
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("欢迎进入注册系统");
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(null);
        userName_Label=new JLabel("姓名:");
        password_Label=new JLabel("设置密码:");
        userName_TestField = new JTextField();
        passwordField = new JPasswordField();

        userName_Label.setSize(70,40);
        userName_Label.setLocation(20,30);
        userName_Label.setFont(new Font("微软雅黑",Font.PLAIN,20));
        userName_TestField.setBounds(100,30,300,40);
        //userName_TestField.setBackground(Color.blue);
        userName_TestField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField.requestFocus();
            }
        });

        password_Label.setSize(100,40);
        password_Label.setLocation(20,90);
        password_Label.setFont(new Font("微软雅黑",Font.PLAIN,20));
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submit.doClick();
            }
        });
        passwordField.setBounds(200,90,300,40);
        passwordField.setEchoChar('$');

        userSex = new JLabel("性别:");
        male = new JRadioButton("男");
        female = new JRadioButton("女");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        userSex.setSize(100,40);
        userSex.setLocation(20,140);
        userSex.setFont(new Font("微软雅黑",Font.PLAIN,20));
        male.setSize(100,40);
        male.setLocation(100,140);
        male.setFont(new Font("微软雅黑",Font.PLAIN,20));
        female.setSize(100,40);
        female.setLocation(200,140);
        female.setFont(new Font("微软雅黑",Font.PLAIN,20));

        userHobbies = new JLabel("个人爱好:");
        h1 = new JCheckBox("唱");
        h2 = new JCheckBox("跳");
        h3 = new JCheckBox("rap");
        h4 = new JCheckBox("篮球");
        userHobbies.setSize(100,40);
        userHobbies.setLocation(20,180);
        userHobbies.setFont(new Font("微软雅黑",Font.PLAIN,20));
        h1.setSize(100,40);
        h1.setLocation(150,180);
        h1.setFont(new Font("微软雅黑",Font.PLAIN,20));
        h2.setSize(100,40);
        h2.setLocation(250,180);
        h2.setFont(new Font("微软雅黑",Font.PLAIN,20));
        h3.setSize(100,40);
        h3.setLocation(350,180);
        h3.setFont(new Font("微软雅黑",Font.PLAIN,20));
        h4.setSize(100,40);
        h4.setLocation(450,180);
        h4.setFont(new Font("微软雅黑",Font.PLAIN,20));


        userCity = new JLabel("请选择您所在的城市:");
        city = new JComboBox();
        city.addItem("北京");
        city.addItem("上海");
        city.addItem("广州");
        city.addItem("深圳");
        city.addItem("临清");
        userCity.setSize(400,40);
        userCity.setLocation(20,220);
        userCity.setFont(new Font("微软雅黑",Font.PLAIN,20));
        city.setSize(100,40);
        city.setLocation(220,220);
        city.setFont(new Font("微软雅黑",Font.PLAIN,20));

        userWords = new JLabel("给自己的一句话:");
        words = new JTextArea();
        userWords.setSize(300,40);
        userWords.setLocation(20,260);
        userWords.setFont(new Font("微软雅黑",Font.PLAIN,20));
        //words.setSize(500,200);
        //words.setLocation(500,260);
        words.setBounds(20,300,300,150);
        //words.setFont(new Font("微软雅黑",Font.PLAIN,20));


        submit = new JButton("注册");
        cancel = new JButton("取消");
        submit.setSize(100,40);
        submit.setLocation(20,480);
        submit.setFont(new Font("微软雅黑",Font.PLAIN,20));
        cancel.setSize(100,40);
        cancel.setLocation(420,480);
        cancel.setFont(new Font("微软雅黑",Font.PLAIN,20));
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog=new JDialog();
                dialog.setTitle("注意！！！");
                dialog.setVisible(true);
                dialog.setSize(600,300);
                dialog.setLocation(600,300);

                JLabel isCancel = new JLabel("您确定要取消吗？");
                dialog.add(isCancel);
                isCancel.setSize(5,5);
                isCancel.setLocation(5,5);
                isCancel.setFont(new Font("微软雅黑",Font.PLAIN,5));

                JButton ok = new JButton("YES");
                JButton no = new JButton("NO");
                dialog.add(ok);
                ok.setSize(1,1);
                ok.setLocation(5,10);
                ok.setFont(new Font("微软雅黑",Font.PLAIN,1));
                dialog.add(no);
                ok.setSize(1,1);
                ok.setLocation(5,10);
                ok.setFont(new Font("微软雅黑",Font.PLAIN,1));
            }
        });




        container.add(userName_Label);
        container.add(password_Label);
        container.add(userName_TestField);
        container.add(passwordField);
        container.add(userSex);
        container.add(male);
        container.add(female);
        container.add(userHobbies);
        container.add(h1);
        container.add(h2);
        container.add(h3);
        container.add(h4);
        container.add(userCity);
        container.add(city);
        container.add(userWords);
        container.add(words);
        container.add(submit);
        container.add(cancel);

    }
    public static void main(String[] args) {
        Register obj = new Register();
    }
}
