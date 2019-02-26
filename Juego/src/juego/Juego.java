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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero
 * <https://github.com/kevinandresforero/JumpParcour>
 */
public class Juego extends JPanel {

    private final Fondo Fondo;
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Toolkit miPantalla = Toolkit.getDefaultToolkit();
    private Dimension tamañomantalla = miPantalla.getScreenSize();
    private final int alto = (int) ((int) tamañomantalla.getHeight()/1.4);
    private final int ancho = (int) ((int) tamañomantalla.getWidth()/1.01);
    
    
    public Juego() throws IOException {

        Fondo = new Fondo();

        imagen2 = new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Fondo/2Fondo.png")).getImage();
        imagen2 = imagen2.getScaledInstance(alto/2, (alto/3)*2, FRAMEBITS); 
        
        imagen = new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Fondo/1Fondo.png")).getImage();
        imagen = imagen.getScaledInstance(ancho, alto, FRAMEBITS);

        imagen3 = new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Fondo/3Fondo.png")).getImage();
        imagen3 = imagen3.getScaledInstance(ancho, alto/1, FRAMEBITS);

        imagen4 = new ImageIcon(getClass().getResource("../juego/Graficos/Recursos/Fondo/4Fondo.png")).getImage();
        imagen4 = imagen4.getScaledInstance(ancho, alto, FRAMEBITS);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g.drawImage(imagen, 0, 0, this);
        g.drawImage(imagen3, 0, 0, this);
        g.drawImage(imagen4, 0, 0, this);
        for (int i = 0; i < 4; i++) {
            g.drawImage(imagen2, (ancho/4) * i + 20, alto/4+20, this);

        }

    }

    private void actulizar() {
           
    }

}
