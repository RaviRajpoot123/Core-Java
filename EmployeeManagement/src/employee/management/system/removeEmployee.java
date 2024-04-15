package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class removeEmployee extends JFrame implements ActionListener {
    JButton delete, back;
    Choice empidChoice;

    removeEmployee() {
        //Closes the Screen if user clicks on close red cross on most topright corner and
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        JLabel label = new JLabel("Employee id");
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label);


        empidChoice = new Choice();
        empidChoice.setBounds(200, 50, 150, 30);
        add(empidChoice);

        try {

            Conn c = new Conn();
            String query = "select * from employeedetail;";
            ResultSet resultSet = c.statement.executeQuery(query);

            while (resultSet.next()) {
                empidChoice.add(resultSet.getString("empid"));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }

        JLabel labelname = new JLabel("Employee name");
        labelname.setBounds(50, 100, 100, 30);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelname);


        JLabel tname = new JLabel();
        tname.setBounds(200, 100, 100, 30);
        tname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tname);


        JLabel labelphone = new JLabel("Phone");
        labelname.setBounds(50, 150, 100, 30);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelname);


        JLabel tphone = new JLabel();
        tphone.setBounds(200, 150, 100, 30);
        tphone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        labelemail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelemail);


        JLabel temail = new JLabel();
        temail.setBounds(200, 200, 100, 30);
        temail.setFont(new Font("Tahoma", Font.BOLD, 10));
        add(temail);


        try {
            Conn c = new Conn();
            String query = "select * from employeedetail where empid='" + empidChoice.getSelectedItem() + "';";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()) {
                tname.setText(resultSet.getString("name"));
                temail.setText(resultSet.getString("email"));
                tphone.setText(resultSet.getString("phone"));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        empidChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {


                    Conn c = new Conn();
                    String query = "select * from employeedetail where empid='" + empidChoice.getSelectedItem() + "';";
                    ResultSet resultSet = c.statement.executeQuery(query);
                    while (resultSet.next()) {
                        tname.setText(resultSet.getString("name"));
                        temail.setText(resultSet.getString("email"));
                        tphone.setText(resultSet.getString("phone"));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        });

        delete = new JButton("Remove");
        delete.setBounds(80, 300, 100, 30);
        delete.setForeground(Color.white);
        delete.setBackground(Color.BLACK);
        delete.addActionListener(this);
        add(delete);

        back = new JButton("Back");
        back.setBounds(200, 300, 100, 30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(700, 80, 200, 200);
        add(img);


        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
        Image i22 = i11.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0, 0, 1120, 630);
        add(image);


        setSize(1000, 400);
        setLocation(300, 150);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delete){
            try{
                Conn c = new Conn();
                String query = "delete from employeedetail where empid = '"+empidChoice.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Data Deleted!");
setVisible(false);
new Home();

            }catch (Exception e11){
                e11.printStackTrace();
            }
        }
        else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new removeEmployee();
    }
}
