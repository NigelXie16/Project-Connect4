import java.awt.*;

public class TokenVis extends Rectangle {
    private Color color;

    /**
     * constructor for TokenVis
     * @param x0
     * @param y0
     * @param w
     * @param h
     */
    
    public TokenVis(int x0, int y0, int w, int h) {
        super(x0, y0, w, h);
    }
    
    /**
     * draw the token
     * @param g
     */
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    /**
     * we will set the player color with parameter of player (player1 or player 2)
     */
    public void setColor(Color player) {
        this.color = player;
    }
}
