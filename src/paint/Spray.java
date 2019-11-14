package paint;

import java.awt.Graphics;
import java.util.Random;

public class Spray extends Ponto {

    int raio = 20;

    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        Random posRandom = new Random();
        for (int i = 0; i < raio; i++) {
            int posx = posRandom.nextInt(raio);
            int posy = posRandom.nextInt(raio);
            g.drawLine(x + posx, y + posy, x + posx, y + posy);
        }
    }

}
