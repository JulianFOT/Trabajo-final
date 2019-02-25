/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */
public final class Fondo {
   
    
    
    Image[] image=new Image[4];
    int i;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamañomantalla = miPantalla.getScreenSize();
    private final int alto = (int) ((int) tamañomantalla.getHeight()/1.4);
    private final int ancho = (int) ((int) tamañomantalla.getWidth()/1.01);
    int x1=0, y1=0 ;
    
    
    
    public void Fondo(Image[] Image)
    {
        
     for( i=0;i<4;i++)
     {
     Image[0]=new ImageIcon(getClass().getResource("juego.Graficos.Recursos.Fondo//1Fondo.png")).getImage();
     Image[1]=new ImageIcon(getClass().getResource("juego.Graficos.Recursos.Fondo//2Fondo.png")).getImage();
     Image[2]=new ImageIcon(getClass().getResource("juego.Graficos.Recursos.Fondo//3Fondo.png")).getImage();
     Image[3]=new ImageIcon(getClass().getResource("juego.Graficos.Recursos.Fondo//4Fondo.png")).getImage();
     }
     
    }
    
    protected void paintComponent(Graphics g){
        
        g.drawImage(image[i], alto, ancho, this);
    } 
}

