import javax.swing.*;
import java.awt.*;

public class welcome_Page {
    JFrame frame = new JFrame();
    JLabel welcome_Label = new JLabel("Hello !");

    welcome_Page(String user_ID){

        welcome_Label.setBounds(0,0,200,35);
        welcome_Label.setFont(new Font(null,Font.PLAIN,25));
        welcome_Label.setText("Hello "+ user_ID);

        frame.add(welcome_Label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(421,421);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
