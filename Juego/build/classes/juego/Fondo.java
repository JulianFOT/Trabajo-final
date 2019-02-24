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
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Fondo {
    //Variables de tamaño del fondo
        int ancho = 1300 , alto = 425 ;
    //Coordenadas iniciales para mover el fondo
        int x1=1300;
        int y1=0;
    //Coordenadas secundariasque mueven otro fondo
        int x2 = 0 ;
        int y2 = 0 ;
    //objeto de la clase juego
        private Juego jueguito;
        
    public Fondo(Juego aThis) {
        
    }

    void mover() {
        x1 = x1 - 1 ;
        x2 = x2 - 1 ;
        
        if (x1==0 & x2==-1300 )
            {
                
                x1 = 1300;
                x2 = 0;
            }
        
    }

    void paint(Graphics2D g) {
        
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/juego/Graficos/recursos/Fondo/1Fondo.png"));
        ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/juego/Graficos/recursos/Fondo/2Fondo.png"));
        ImageIcon imagenFondo3 = new ImageIcon(getClass().getResource("/juego/Graficos/recursos/Fondo/3Fondo.png"));
        ImageIcon imagenFondo4 = new ImageIcon(getClass().getResource("/juego/Graficos/recursos/Fondo/4Fondo.png"));
        g.drawImage(imagenFondo.getImage(), x1, y1,ancho,alto,null);
        g.drawImage(imagenFondo.getImage(), x2, y2,ancho,alto,null);
        g.drawImage(imagenFondo2.getImage(), x1, y1,ancho,alto,null);
        g.drawImage(imagenFondo2.getImage(), x2, y2,ancho,alto,null);
        g.drawImage(imagenFondo3.getImage(), x1, y1,ancho,alto,null);
        g.drawImage(imagenFondo3.getImage(), x2, y2,ancho,alto,null);
        g.drawImage(imagenFondo4.getImage(), x1, y1,ancho,alto,null);
        g.drawImage(imagenFondo4.getImage(), x2, y2,ancho,alto,null);
        
    }

    
}
