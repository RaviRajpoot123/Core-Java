import javax.swing.*;

public class gameFrame extends JFrame {
    gameFrame(){
        //gamePanal panal =new gamePanal();
        // Calling gamePanal if we don't add this we only simple Strips we cam't get game_Window
        this.add(new gamePanal());
        // Adds the title on the top of game_window
        this.setTitle("Snack");
        // Stops the program if we close the game_Window by clicking close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        // Makes the game_Window visible without this our program will run, but it will be not visible
        this.setVisible(true);
        // This function POP_up the game_Window in the center
        this.setLocationRelativeTo(null);
    }
}
