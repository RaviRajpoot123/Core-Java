package employee.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewEmployee extends JFrame implements ActionListener {
    Choice empChoice;
    JTable table;
    JButton searchB, updateB, printB, backB;

    viewEmployee() {
        //Closes the Screen if user clicks on close red cross on most topright corner and
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        getContentPane().setBackground(new Color(255, 131, 122));
        JLabel search = new JLabel("Search by employee id");
        search.setBounds(20, 20, 150, 20);
        add(search);


        empChoice = new Choice();
        empChoice.setBounds(170, 20, 150, 20);
        add(empChoice);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employeedetail");
            while (resultSet.next()) {
                empChoice.add(resultSet.getString("empid"));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        table = new JTable();


        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employeedetail");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e4) {
            e4.printStackTrace();
        }

        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(0, 100, 900, 800);
        add(jp);

        searchB = new JButton("Search");
        searchB.setBounds(20, 70, 80, 20);
        searchB.addActionListener(this);
        add(searchB);



        updateB = new JButton("Update");
        updateB.setBounds(620, 70, 80, 20);
        updateB.addActionListener(this);
        add(updateB);

        backB = new JButton("Back");
        backB.setBounds(320, 70, 80, 20);
        backB.addActionListener(this);
        add(backB);


        setSize(900, 700);
        setLocation(300, 100);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchB) {
            String query = "select * from employeedetail where empid = '"+empChoice.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception e5) {
                e5.printStackTrace();
            }

        } else if (e.getSource()==updateB) {
            setVisible(false);
            new updateEmployee(empChoice.getSelectedItem());

        }else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new viewEmployee();
    }
}
