package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateEmployee extends JFrame implements ActionListener {
    JTextField teducation, tfname, taddress, tphone, tadhaar, temail, tsalary, tdesignation;
    JLabel tempid;
    JButton submit, back;
    String number;

    updateEmployee(String number) {
        this.number = number;
        //Closes the Screen if user clicks on close red cross on most topright corner and
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();

        getContentPane().setBackground(new Color(163, 255, 188));
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 25));
        add(heading);
//Name Label and Textfield
        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);


        JLabel tname = new JLabel();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(177, 252, 197));
        add(tname);

// Father Name Label and Textfield
        JLabel fname = new JLabel("Father's name");
        fname.setBounds(400, 150, 150, 30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(fname);


        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        tfname.setBackground(new Color(177, 252, 197));
        add(tfname);
// DOB Section
        JLabel DOB = new JLabel("Date Of Birth");
        DOB.setBounds(50, 200, 150, 30);
        DOB.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(DOB);

        JLabel tDOB = new JLabel();
        tDOB.setBounds(200, 200, 150, 30);
        tDOB.setBackground(new Color(177, 252, 197));
        add(tDOB);
// Salary Section
        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(salary);


        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(177, 252, 197));
        add(tsalary);


// AddressSection
        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);


        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(177, 252, 197));
        add(taddress);


//Email AddressSection
        JLabel email = new JLabel("Email Address");
        email.setBounds(400, 250, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);


        temail = new JTextField();
        temail.setBounds(600, 250, 150, 30);
        temail.setBackground(new Color(177, 252, 197));
        add(temail);


        //Education section
        JLabel education = new JLabel("Highest Education");
        education.setBounds(400, 350, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);

        teducation = new JTextField();
        teducation.setBounds(600, 350, 150, 30);
        teducation.setBackground(new Color(177, 252, 197));
        add(teducation);
        //Phone number
        JLabel phoneno = new JLabel("Phone Number");
        phoneno.setBounds(50, 300, 150, 30);
        phoneno.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phoneno);

        tphone = new JTextField();
        tphone.setBounds(200, 300, 150, 30);
        tphone.setBackground(new Color(177, 252, 197));
        add(tphone);

        //Adhaar Section

        JLabel adhaar = new JLabel("Adhaar Number");
        adhaar.setBounds(400, 300, 150, 30);
        adhaar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(adhaar);

        JLabel tadhaar = new JLabel();
        tadhaar.setBounds(600, 300, 150, 30);
        tadhaar.setBackground(new Color(177, 252, 197));
        add(tadhaar);


        //designation department
        JLabel designation = new JLabel("Employee Designation");
        designation.setBounds(50, 350, 150, 30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        tdesignation.setBackground(new Color(177, 252, 197));
        add(tdesignation);


        //emp id
        JLabel empid = new JLabel("Employee id");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid = new JLabel();
        tempid.setBounds(200, 400, 150, 30);
        tempid.setBackground(new Color(177, 252, 197));
        tempid.setForeground(Color.DARK_GRAY);
        tempid.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
        add(tempid);

        //getting table data from database for update
        try {
            Conn c = new Conn();
            String query = "select * from employeedetail where empid = '" + number + "'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()) {
                tname.setText(resultSet.getString("name"));
                tfname.setText(resultSet.getString("fname"));
                tDOB.setText(resultSet.getString("dob"));
                taddress.setText(resultSet.getString("address"));
                tsalary.setText(resultSet.getString("salary"));
                tphone.setText(resultSet.getString("phone"));
                tadhaar.setText(resultSet.getString("aadhar"));
                temail.setText(resultSet.getString("email"));
                teducation.setText(resultSet.getString("education"));

                tempid.setText(resultSet.getString("empid"));
                tdesignation.setText(resultSet.getString("designation"));

            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }


//Submit button
        submit = new JButton("Update Details");
        submit.setBounds(600, 500, 100, 30);
        submit.setBackground(Color.CYAN);
        submit.setForeground(Color.DARK_GRAY);
        submit.addActionListener(this);
        add(submit);


        //Back button
        back = new JButton("Back");
        back.setBounds(100, 500, 100, 30);
        back.setBackground(Color.CYAN);
        back.setForeground(Color.DARK_GRAY);
        back.addActionListener(this);
        add(back);


        //add employee Window creation
        setSize(900, 700);
        setLayout(null);
        setLocation(300, 50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String email = temail.getText();
            String phone = tphone.getText();
            String designtion = tdesignation.getText();
            String education = teducation.getText();
            try {
                Conn c = new Conn();

                String query = "update employeedetail set fname='" + fname + "',salary='" + salary + "',address='" + address + "',phone='" + phone + "',education='" + education + "',email='" + email + "',designation='" + designtion + "'where empid = '"+number+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
                new Home();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }else {
            setVisible(false);
            new Home();
        }

    }

    public static void main(String[] args) {
        new updateEmployee("");

    }


}
