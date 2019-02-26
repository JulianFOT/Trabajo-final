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
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */

    public class Juego  extends JPanel {
        
        
        Image Imagen;
        private final Fondo Fondo;
        
        
       
        public  Juego() throws IOException
        {
        
        Fondo=new Fondo();
        
            Imagen= ImageIO.read(getClass().getResource("juego.Graficos.Recursos.Fondo//1Fondo."));
        
        }
        
        
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
          Graphics2D g2d = (Graphics2D) g;
          
         g.drawImage(Fondo.getImagen(),Fondo.getAlto(),Fondo.getAncho(), this);
           

        }

    private void actulizar() {
        
        
    }
         
 }
        