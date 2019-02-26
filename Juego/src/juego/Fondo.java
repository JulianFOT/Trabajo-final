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
   
    
    
    Image Imagen;
    int i;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    
    Dimension tamañomantalla = miPantalla.getScreenSize();
    private final int alto = (int) (int) tamañomantalla.getHeight();
    
    private final int ancho = (int) (int) tamañomantalla.getWidth();
    int x1=0, y1=0 ;
    
    
    
    public  Fondo()
    {
        
     Imagen= new ImageIcon(getClass().getResource("juego.Graficos.Recursos.Fondo//1Fondo.png")).getImage();
    }
//    Imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
//        System.out.println("carga exitosa");
    public int getAlto() 
    {
        return alto;
    }

    public int getAncho() 
    {
        return ancho;
    }

    public Image getImagen() 
    {
        return Imagen;
    }
}

