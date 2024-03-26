import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class login_Page implements ActionListener  {
    JFrame frame =  new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField user_ID_Field = new JTextField("");
    JPasswordField user_Password_Field = new JPasswordField();
    JLabel user_ID_Label = new JLabel("User ID");
    JLabel user_Password_Label = new JLabel("Password");

    JLabel message_Label = new JLabel();

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    login_Page(HashMap<String,String> loginInfoOriginal){
        user_ID_Label.setBounds(50,100,75,25);
        user_Password_Label.setBounds(50,150,75,25);

        message_Label.setBounds(125,250,250,35);
        message_Label.setFont(new Font(null ,Font.ITALIC, 25 ));

        user_ID_Field.setBounds(125,100,200,25);
        user_Password_Field.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(user_ID_Field);
        frame.add(user_Password_Field);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(message_Label);
        frame.add(user_ID_Label);
        frame.add(user_Password_Label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(421,421);
        frame.setLayout(null);
        frame.setVisible(true);

        loginInfo = loginInfoOriginal;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton){
            user_ID_Field.setText("");
            user_Password_Field.setText("");
        }

        if (e.getSource() == loginButton){
            String user_ID = user_ID_Field.getText();
            String user_Password = String.valueOf(user_Password_Field.getPassword());
            if (loginInfo.containsKey(user_ID)){
                if (loginInfo.get(user_ID).equals(user_Password)){
                    message_Label.setForeground(Color.green);
                    message_Label.setText("Login Successfully done!");
                    frame.dispose();
                    welcome_Page welcomePage = new welcome_Page(user_ID);
                }
               else {
                    message_Label.setForeground(Color.red);
                    message_Label.setText("Wrong password!");
               }
            }else {
                message_Label.setForeground(Color.red);
                message_Label.setText("userName not exist ");
            }
        }
    }
}
