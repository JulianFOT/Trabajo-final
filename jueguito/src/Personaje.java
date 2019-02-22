
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje {
   
	int ancho = 50;
	int alto = 50;
	int x = 10;
        int y = 350;
	int x1 = 0;
        int y1=0;
	private Juego jueguito;
        boolean saltando=false;
        boolean sube=false;
        boolean baja=false;
        cargarImagen carga = new cargarImagen("C:\\Users\\Labing960Clon\\Downloads\\imageedit_1_2207419749.png");
        Image imagen = carga.img;
        
	public Personaje(Juego jueguito) {
		this.jueguito= jueguito;
	}

	public void mover() {
		if (x + x1 > 0 && x + x1 < jueguito.getWidth() - ancho)
			x = x + x1;
               
                if(saltando)
                {
                    if(y == 350)//el personaje esta en el suelo
                        {sube=true;
                        y1=-5;
                        baja=false;}
                    if(y == 225)//el personale llego al limite del salto
                        {baja=true;
                        y1=5;
                        sube=false;
                        }
                    
                    
                    if(sube)
                        {
                            y = y + y1;
                        }
                    if(baja)
                        {
                            
                            y = y + y1;
                            if(y == 350)
                            {
                                saltando=false;
                            }
                        }
                }
        }

	public void paint(Graphics2D g) {
            //Graphics2D g2d = new Graphics2D(Graphics g);
            g.drawImage(imagen, x, y, jueguito);
        }

	public void keyPressed(KeyEvent e) {
		
                if (e.getKeyCode() == KeyEvent.VK_SPACE)
                    {
                        saltando=true;
                    }
	}
        
	public Rectangle getBounds() {
		return new Rectangle(x+5, y+y1, ancho, alto);
	}
}