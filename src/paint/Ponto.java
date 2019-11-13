package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author marce
 */
public class Ponto {
    int x, y;
    Color cor;
    
    public void desenhar(Graphics g){
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }    
}
