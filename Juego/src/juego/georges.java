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
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k2.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k3.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k4.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k5.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k6.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k7.png")).getImage(),
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k8.png")).getImage(),
    };
    
    Image[] salto ={
        new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Personaje/k1.png")).getImage()
    };
    
    public georges(){   
        numeroVidas = 3;
        x = 40;
        y = 60;
    }
    
    
}
