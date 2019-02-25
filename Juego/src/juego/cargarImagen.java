/*
 * Copyright (C) 2019 Estudiantes
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
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Estudiantes
 */
public class cargarImagen {
    Image img;
    String ruta;

    public cargarImagen(String ruta) throws IOException {
        this.img = ImageIO.read(new File(ruta)); // Controlar la excepcion si la imagen no se encuentra o no se pudo cargar
    }
    
}
