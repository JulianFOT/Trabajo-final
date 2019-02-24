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
public class Obstaculo {

    public Obstaculo(Juego aThis) {
    }

    void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void paint(Graphics2D g) {
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/juego/Graficos/Recursos/Personaje/"));
        g.drawImage(imagenFondo.getImage(), 400, 125,150,150,null);
    }
    
}
