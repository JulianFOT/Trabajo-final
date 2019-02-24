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
package juego.Graficos;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Dibujo extends JFrame{

    int posx, posy;
    Image imagen;
    String UbicacionImagen;
     
    public Dibujo(String UbicacionImagen,int pox, int posy){
        this.posx = posx;
        this.posy = posy;
        this.UbicacionImagen = UbicacionImagen;
        ImageIcon ImageIcon = new ImageIcon(this.getClass().getResource(this.UbicacionImagen));
        this.imagen = ImageIcon.getImage();
    }
    
    public Image getImage(){
        return imagen;
    }
    
    public int getposx(){
        return posx;
    }

    public int getposy(){
        return posy;
    }    
    
    public void setImage(String Ubicacion){
        this.UbicacionImagen = Ubicacion;
        ImageIcon img = new ImageIcon(this.getClass().getResource(Ubicacion));
        this.imagen = img.getImage();
    }
    
}
