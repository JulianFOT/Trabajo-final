/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package juego;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */

    public class Juego extends JPanel{
        
        Personaje personaje1 = new Personaje(this);
        Obstaculo obstaculo1 = new Obstaculo(this);
        Fondo fondo = new Fondo(this);
        
        private static volatile boolean EstadoDeJuego = false ;
        public int puntaje = 0;
        
        public Juego(){
            System.out.println("Juego()");
            
            addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent ke) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent ke) {
                    personaje1.keyPressed(ke);
                }

                @Override
                public void keyReleased(KeyEvent ke) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            {
                setFocusable(true);
            }
  
        }       
        
    void mover(){
        System.out.println("mover()");
        personaje1.mover();
        fondo.mover();
        obstaculo1.mover();
    }
    
    public void dibujar(Graphics2D g) {
        
        mover();
        
        
        fondo.paint(g);
        personaje1.paint(g);
        obstaculo1.paint(g);
        
    }
    
}
