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

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;
import juego.Juego;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Ventana extends JFrame {
    
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamañomantalla = miPantalla.getScreenSize();
    private final int alto = (int) ((int) tamañomantalla.getHeight()/1.4);
    private final int ancho = (int) ((int) tamañomantalla.getWidth()/1.01);

    public Ventana() throws IOException{
        
        /*
          *   Se crea y setea la ventana Principal
        */
        JFrame ventana = new JFrame("Jueguito");
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(ancho, alto);
        ventana.setTitle("Jump Parcours");
        System.out.println("Ventana() de : "+ancho+" * "+alto);
        Image icono = miPantalla.getImage("Graficos/Recursos/icono.gif");
        ventana.setIconImage(null);
        ventana.add(new Juego());
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setCursor(1);
        ventana.setLocationRelativeTo(null);
        
    }
    
}
