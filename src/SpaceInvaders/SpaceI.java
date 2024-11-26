package SpaceInvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpaceI extends JPanel implements Runnable, KeyListener{
    private Thread gameThread;
    private boolean running;
    
    public SpaceI() {                  //constructor para el interfas
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);
        startGame();
    }
    
    private void startGame() {        //inicia el juego
        gameThread = new Thread(this);
        running = true;
        gameThread.start();
    }
    
    public void run() {
        while (running) {
            update();
            repaint();
            try {
                Thread.sleep(16); // ira a 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void update() {
       
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

  

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
