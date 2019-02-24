/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
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

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */

    public class Juego extends JPanel {

        private Image FondoJuego;
        private final Fondo luz;
        private final Fondo efecto;
        private final Fondo contruccion;
        private final Fondo ciudad;
        
        public Juego(){
            luz = new Fondo("Graficos/Recursos/Fondo/1Fondo.png");
            efecto = new Fondo("Graficos/Recursos/Fondo/2Fondo.png");
            contruccion = new Fondo("Graficos/Recursos/Fondo/3Fondo.png");
            ciudad = new Fondo("Graficos/Recursos/Fondo/4Fondo.png");
        }
        
        
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
/*          Graphics2D g2d = (Graphics2D) g;
            ImageIcon imagenFondo =new ImageIcon(getClass().getResource("/Imagenes/1Fondo.png"));
            ImageIcon imagenFondo2 =new ImageIcon(getClass().getResource("/Imagenes/2Fondo.png"));
            ImageIcon imagenFondo3 =new ImageIcon(getClass().getResource("/Imagenes/3Fondo.png"));
            ImageIcon imagenFondo4 =new ImageIcon(getClass().getResource("/Imagenes/4Fondo.png"));
*/
            g.drawOval(100, 100, 100, 100);
            g.drawString("sirva catrehijueputa malparido", 1352-1300, 548-500);
            g.drawImage(luz.getImage(), 100, 100, this);
            g.drawImage(efecto.getImage(), 0, 0, this);
        }

    private void actulaizar() {
        
    }
         
 }
        