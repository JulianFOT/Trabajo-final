
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class cargarImagen {

    Image img;
    String ruta;

    public cargarImagen(String ruta) {
        try {
            this.img = ImageIO.read(new File(ruta));
        } catch (IOException e)   {
            // Controlar la excepcion si la imagen no se encuentra o no se pudo cargar
        }
    }
}
