import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class gamePanal extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int   GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int[] x = new int[GAME_UNITS];

    final int[] y = new int[GAME_UNITS];
    int bodyParts = 6;
    int appleEaten;
    int apple_X;
    int apple_Y;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    gamePanal(){

        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();
    }
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        if(running) {
            // Used to draw a grid lines just to understand
            /*  for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {

                  g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                  g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);

              }*/
            g.setColor(Color.red);
            g.fillOval(apple_X, apple_Y, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                //Displaying Score by mentioning color, font , font size, position
                g.setColor(Color.red);
                g.setFont(new Font("ink Free", Font.BOLD,45));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("Score :" + appleEaten, (SCREEN_WIDTH - metrics.stringWidth("Score :" + appleEaten))/2,g.getFont().getSize() );

            }

        }else {
            gameOver(g);
        }
    }

    public void newApple(){
        // We are generating random position on X_axis & Y_axis
        apple_X = random.nextInt(SCREEN_WIDTH/UNIT_SIZE)*UNIT_SIZE;
        apple_Y = random.nextInt(SCREEN_HEIGHT/UNIT_SIZE)*UNIT_SIZE;

    }
    public void move(){
        //We are defining moves where our snake is moving
        for (int i = bodyParts; i >0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }



        switch (direction) {
            // Defining what will  happen if snake moves towards upper border, action to be taken
            case 'U': {
                y[0] = y[0] - UNIT_SIZE;
                break;
            }

            // Defining what will  happen if snake moves towards Bottom border, action to be taken
            case 'D': {

                y[0] = y[0] + UNIT_SIZE;
                break;
            }

            // Defining what will  happen if snake moves towards Left border, action to be taken
            case 'L': {
                x[0] = x[0] - UNIT_SIZE;
                break;
            }

            // Defining what will  happen if snake moves towards right border, action to be taken
            case 'R': {
                x[0] = x[0] + UNIT_SIZE;
                break;
            }
        }
    }
    public void checkEatenApple(){
        //checks eaten apple and calls the new apple function
        for (int i = bodyParts; i > 0 ; i--) {
            if ((x[i] == apple_X) && y[i] == apple_Y) {
                bodyParts++;
                appleEaten++;
                newApple();
                break;

            }
        }
    }

    public void checkCollisions(){
        //checks head collides with body
        for (int i = bodyParts; i > 0 ; i--) {
            if ((x[0] == x[i]) && y[0] == y[i]) {
                running = false;
                break;
            }
        }

    //checks head collides with left border
        if (x[0]< 0){
            running = false;
        }
        //checks head collides with right border
        if (x[0]>SCREEN_WIDTH){
            running = false;
        }
        //checks head collides with upper border
        if (y[0] < 0){
            running = false;
        }
        // checks head collides bottom border
        if (y[0] > SCREEN_HEIGHT){
            running = false;
        }
        if(!running){
            timer.stop();
        }
    }

    public void gameOver(Graphics g){
        // GameOver text
        g.setColor(Color.red);
        g.setFont(new Font("ink Free", Font.BOLD,75));
        FontMetrics metrics_0 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics_0.stringWidth("Game Over"))/2,(SCREEN_HEIGHT/2 ));
// Score on Top of game_Over_Window
        g.setColor(Color.yellow);
        g.setFont(new Font("ink Free", Font.BOLD,45));
        FontMetrics metrics_1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + appleEaten, (SCREEN_WIDTH - metrics_1.stringWidth("Score :" + appleEaten))/2,g.getFont().getSize() );


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running){
            move();
            checkEatenApple();
            checkCollisions();

        }
        repaint();
    }
    public class myKeyAdapter extends KeyAdapter{
        // In this class -> Managing Events by pressing Keys
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                // In this class -> Managing Events by Left Arrow pressing Key
                case KeyEvent.VK_LEFT -> {
                    if (direction != 'R'){
                        direction = 'L';

                    }

                }
                // In this class -> Managing Events by Right Arrow pressing Key
                case KeyEvent.VK_RIGHT -> {
                    if (direction != 'L'){
                        direction = 'R';
                    }
                }
                // In this class -> Managing Events by Up Arrow pressing Key
                case KeyEvent.VK_UP -> {
                    if (direction != 'D'){
                        direction = 'U';
                    }
                }
                // In this class -> Managing Events by Down Arrow pressing Key
                case KeyEvent.VK_DOWN ->{
                    if (direction != 'U') {
                        direction = 'D';
                    }
                }

            }
        }
    }
}
