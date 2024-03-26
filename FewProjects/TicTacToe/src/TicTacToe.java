import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_Panel = new JPanel();
    JPanel button_Panel = new JPanel();
    JLabel text_Field = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player_1_Turn;

    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        text_Field.setBackground(new Color(25,25,25));
        text_Field.setForeground(new Color(136, 2, 193));
        text_Field.setFont(new Font("Ink Free",Font.BOLD,75));
        text_Field.setHorizontalAlignment(JLabel.CENTER);
        text_Field.setText("Tic-Tac-Toe");
        text_Field.setOpaque(true);

        title_Panel.setLayout(new BorderLayout());
        title_Panel.setBounds(0,0,800,100);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Bola",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

        title_Panel.add(text_Field);
        frame.add(title_Panel,BorderLayout.NORTH);
        frame.add(button_Panel);

        button_Panel.setLayout(new GridLayout(3,3));
        button_Panel.setBackground(new Color(150,125,125));
        first_Turn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]){
                if (player_1_Turn){
                    if (buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player_1_Turn = false;
                        text_Field.setText("O's Turn");
                        check();
                    }
                }else {
                    buttons[i].setForeground(new Color(0,0,255));
                    buttons[i].setText("O");
                    player_1_Turn = true;
                    text_Field.setText("X's Turn");
                    check();
                }
            }

        }

    }
    public void first_Turn(){
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if (random.nextInt(2) == 0){
            player_1_Turn = true;
            text_Field.setText("X's Turn");

        }else {
            player_1_Turn = false;
            text_Field.setText("O's Turn");
        }
    }
        //X's winning Co Ordinations
    public void check(){

        for(int count = 0 ; count < 9 ; count ++){

        if (
                 (buttons[0].getText() == "X" &&
                  buttons[1].getText() == "X" &&
                  buttons[2].getText() == "X")
                         ||
                 (buttons[3].getText() == "X" &&
                  buttons[4].getText() == "X" &&
                  buttons[5].getText() == "X")
                         ||
                 (buttons[6].getText() == "X" &&
                  buttons[7].getText() == "X" &&
                  buttons[8].getText() == "X")
                         ||
                 (buttons[0].getText() == "X" &&
                 buttons[3].getText() == "X" &&
                 buttons[6].getText() == "X")
                         ||
                (buttons[1].getText() == "X" &&
                 buttons[4].getText() == "X" &&
                 buttons[7].getText() == "X")
                         ||
                (buttons[2].getText() == "X" &&
                 buttons[5].getText() == "X" &&
                 buttons[8].getText() == "X")
                         ||
                 (buttons[0].getText() == "X" &&
                 buttons[4].getText() == "X" &&
                 buttons[8].getText() == "X")
                         ||
                (buttons[2].getText() == "X" &&
                 buttons[4].getText() == "X" &&
                 buttons[6].getText() == "X")
        ){
            x_Wins();

        }


        //O's winning Co Ordinations
        if (
                (buttons[0].getText() == "O" &&
                 buttons[1].getText() == "O" &&
                 buttons[2].getText() == "O")
                        ||
                (buttons[3].getText() == "O" &&
                 buttons[4].getText() == "O" &&
                 buttons[5].getText() == "O")
                        ||
                (buttons[6].getText() == "O" &&
                 buttons[7].getText() == "O" &&
                 buttons[8].getText() == "O")
                        ||
                (buttons[0].getText() == "O" &&
                 buttons[3].getText() == "O" &&
                 buttons[6].getText() == "O")
                        ||
                (buttons[1].getText() == "O" &&
                 buttons[4].getText() == "O" &&
                 buttons[7].getText() == "O")
                        ||
                (buttons[2].getText() == "O" &&
                 buttons[5].getText() == "O" &&
                 buttons[8].getText() == "O")
                        ||
                (buttons[0].getText() == "O" &&
                 buttons[4].getText() == "O" &&
                 buttons[8].getText() == "O")
                        ||
                (buttons[2].getText() == "O" &&
                 buttons[4].getText() == "O" &&
                 buttons[6].getText() == "O")
        ){
            o_Wins();

            }

        }
    }
    public void x_Wins(){
        text_Field.setText("X Wins");
        text_Field.setForeground(new Color(255,0,0));

        for (int i = 0; i < 9; i++) {

            buttons[i].setEnabled(false);
        }
    }
    public void o_Wins(){
        text_Field.setText("O Wins");
        text_Field.setForeground(new Color(0,0,255));

        for (int i = 0; i < 9; i++) {

            buttons[i].setEnabled(false);
        }
    }
    public void match_Draw(){

        text_Field.setText("Match Draw!");
        text_Field.setForeground(Color.DARK_GRAY);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
    }
}
