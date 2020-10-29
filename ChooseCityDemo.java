package lolly.j01.Demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseCityDemo extends JFrame {
    private String[] city_Names;
    private JCheckBox[] cities_CheckBoxes;
    private JButton ok_btn;
    private JLabel select_Text;

    public ChooseCityDemo() {
        init();
    }

    private void init() {
        setTitle("We are studying on JCheckBox!");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        select_Text = new JLabel("请选择您喜欢的城市：");
        select_Text.setBounds(30,30,600,20);
        select_Text.setFont(new Font("宋体",Font.BOLD,20));

        city_Names = new String[] {"青岛","昆明","大理","上海","无锡","南宁","临清"};
        cities_CheckBoxes = new JCheckBox[city_Names.length];
        for(int i = 0; i < cities_CheckBoxes.length; i++) {
            cities_CheckBoxes[i] = new JCheckBox(city_Names[i]);
            cities_CheckBoxes[i].setBounds(30+i*70, 80,70,40);
            cities_CheckBoxes[i].setFont(new Font("宋体",Font.BOLD,20));
            container.add(cities_CheckBoxes[i]);
        }

        ok_btn = new JButton("提交");
        ok_btn.setBounds(30,130,150,20);
        ok_btn.setFont(new Font("宋体",Font.BOLD,20));

        ok_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String select_city = new String();
                for(int i=0;i<cities_CheckBoxes.length;i++) {
                    if(cities_CheckBoxes[i].isSelected()) {
                        select_city+=cities_CheckBoxes[i].getText()+" ";
                    }
                }
                select_Text.setText("您选择的城市是："+select_city);
                System.out.println("您选择的城市是："+select_city);
            }
        });

        container.add(select_Text);
        container.add(ok_btn);
    }

    public static void main(String[] args) {
        ChooseCityDemo chooseCityDemo = new ChooseCityDemo();
        chooseCityDemo.setVisible(true);

    }
}
