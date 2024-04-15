package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    Home() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 630);

        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340, 155, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        JButton Add = new JButton("Add employee");
        Add.setBounds(335,270,150,40);
        Add.setForeground(Color.white);
        Add.setBackground(Color.BLACK);
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Add){
                    setVisible(false);
                    new addEmployee();
                }

            }
        });

        img.add(Add);


        JButton View = new JButton("View employee");
        View.setBounds(565,270,150,40);
        View.setForeground(Color.white);
        View.setBackground(Color.BLACK);
View.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

if (e.getSource() == View){
    setVisible(false);
    new viewEmployee();
}

    }
});
        img.add(View);


        JButton Remove = new JButton("Remove employee");
        Remove.setBounds(450,390,150,40);
        Remove.setForeground(Color.white);
        Remove.setBackground(Color.BLACK);
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
new removeEmployee();
            }
        });
        img.add(Remove);


//Closes the Screen if user clicks on close red cross on most topright corner and
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
//Home Window creation
        setSize(1120, 630);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }
}
