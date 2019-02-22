package Codigo;


import Codigo.Juego;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Obstaculo {
        int ancho = 20;
	int alto = 50;
	int x = 1300;
	int y = 350;
	int x1 = -5;
	
	private Juego jueguito;

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
              
            g.fillRect(x, y, ancho, alto);
        
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, ancho, alto);
        }
}