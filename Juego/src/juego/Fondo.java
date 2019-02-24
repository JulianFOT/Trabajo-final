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
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */
public final class Fondo {
    Image imagen ;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamañomantalla = miPantalla.getScreenSize();
    private final int alto = (int) ((int) tamañomantalla.getHeight()/1.4);
    private final int ancho = (int) ((int) tamañomantalla.getWidth()/1.01);
    int x1=0, y1=0 ;
    public Fondo(String ruta){
        File f = new File(ruta) ;
            System.out.println("Se cargo dorrectamente el fondo de la ruta: "+ruta);    
    }
    
    public Image getImage(){
        return imagen ;
    }
    
    public int getAltura(){
        return alto;
    }

    public int getAnchura(){
        return ancho;
    }
    
}

