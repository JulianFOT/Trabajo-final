/*
 * Copyright (C) 2019 Kevin Guaitero y Julian Olaya <https://github.com/kevinandresforero/JumpParcour>
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

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Guaitero y Julian Olaya <https://github.com/kevinandresforero/JumpParcour>
 */
class georges extends Personaje{
    
    int contador = 0 ;
    Image[] Correr = {
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/Correr/1.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/2.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/3.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/4.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/5.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/6.gif")).getImage(),
    };
    
    Image[] salto ={
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/saltar/salto1.gif")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/saltar/salto2.gif")).getImage(),
    };
    
    public georges(){
        Saltos = 2;
        x = 10;
        y = 350;
    }
    
    public void mover(){
        
        
/*if (dx > 0 && x <= 1250) {
            x += dx;
        } else if (dx < 0 && x >= 10) {
            x += dx;
        }

        if (dy > 0 && y <= 780) {
            y += dy;
        } else if (dy < 0 && y >= 10) {
            y += dy;
        }
*/
    }
    
}
