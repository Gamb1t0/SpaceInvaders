package SpaceInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Jugador {
    private int x, y, width, height, speed;
    private boolean left, right;

    public Jugador(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 50;
        this.height = 20;
        this.speed = 5;
    }
    
    public void update() {  //movimiento para abajo
        y +=1;
    }
    
    public void drawnU(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    public int getY() {
        return y;
    }
            
}
