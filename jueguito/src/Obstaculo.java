
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public class Obstaculo {
        int ancho = 20;
	int alto = 50;
	int x = 1300;
	int y = 350;
	int x1 = -5;
	
	private Juego jueguito;
        cargarImagen carga1 = new cargarImagen("src/Obstaculo/1.png");
        Image imagen1 = carga1.img;

	public Obstaculo (Juego jueguito) {
		this.jueguito= jueguito;
	}

	void mover() {
            
            if (x<=-50)
                {
                    jueguito.puntos++;
                    x=1300;
                }else
                    {
                        
                        if (colision())
                        {
                            jueguito.finJuego();
                        }else{
                            x = x + x1;
                        }
                    }
        }

	private boolean colision() {
		return jueguito.personaje1.getBounds().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
              
              g.drawImage(imagen1, x-20, y-40, ancho+60, alto+40, jueguito);
        
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, ancho, alto);
        }
}