/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.util.Random;

/**
 *
 * @author marce
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int raio=4;
        Random posRandom = new Random();
        for(int i=0; i<raio; i++){
            int posx = posRandom.nextInt(raio);
            int posy = posRandom.nextInt(raio);
            System.out.println("Posx: "+posx+" Pos y: "+posy);
        }
    }
    
}
