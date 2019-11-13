/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author marce
 */
public class Cilindro extends D3 {

    int x2, y2;
    Color corInterna = null;

    public void desenhar(Graphics g, Boolean fundo) {
        //reta 1
        g.setColor(cor);
        g.drawLine(x, y, x, y2);
        
        //reta 2
        g.setColor(cor);
        g.drawLine(x2, y, x2, y2);
        
        if(fundo){
            g.setColor(corFundo);
            g.fillOval(x, y, x2-x, 2);
        }
        g.setColor(cor);
        g.drawOval(x, y, x2-x, 4);
        
        if(fundo){
            g.setColor(corFundo);
            g.fillOval(x, y2, x2-x, 2);
        }
        g.setColor(cor);
        g.drawOval(x, y2, x2-x, 4);
        
        
    }
    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
