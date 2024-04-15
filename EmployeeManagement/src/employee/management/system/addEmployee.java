package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class addEmployee extends JFrame implements ActionListener {
    Random random = new Random();
    int number = random.nextInt(999999);


    JTextField tname, tfname, taddress, tphone, tadhaar, temail, tsalary, tdesignation;
    JLabel tempid;
    JDateChooser tDOB;
    JComboBox teducation;
    JButton submit, back;

    addEmployee() {

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


        tname = new JTextField();
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

        tDOB = new JDateChooser();
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

        tadhaar = new JTextField();
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

        //Education section
        JLabel edu = new JLabel("Highest Education");
        edu.setBounds(400, 350, 150, 30);
        edu.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(edu);

        String[] items = {"Select Education", "B.tech", "B.Com", "M.Tech", "M.COM", "BBA", "MBA", "PHD", "MBBS", "BHMS", "BA", "MA", "BCA", "MCA", "BSC", "MSC"};
        teducation = new JComboBox(items);
        teducation.setBackground(new Color(177, 252, 197));
        teducation.setBounds(600, 350, 150, 30);
        add(teducation);


        //Generating emp id
        JLabel empid = new JLabel("Employee id");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid = new JLabel("" + number);
        tempid.setBounds(200, 400, 150, 30);
        tempid.setBackground(new Color(177, 252, 197));
        tempid.setForeground(Color.DARK_GRAY);
        tempid.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
        add(tempid);


//Submit button
        submit = new JButton("Submit");
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
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tDOB.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String email = temail.getText();
            String phone = tphone.getText();
            String education = ((String) teducation.getSelectedItem());
            String designtion = tdesignation.getText();
            String aadhar = tadhaar.getText();
            String empid = tempid.getText();
            try {

                Conn c = new Conn();
                String query = "insert into employeedetail Value('" + name + "','" + fname + "','" + dob + "','" + salary + "','" + address + "','" + phone + "','" + education + "','" + email + "','" + designtion + "','" + aadhar + "','" + empid + "')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully!");
                setVisible(false);
                new Home();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {

            try {
                Thread.sleep(100);
                setVisible(false);
                new Home();
            } catch (Exception e2) {
                e2.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {
        new addEmployee();
    }


}
