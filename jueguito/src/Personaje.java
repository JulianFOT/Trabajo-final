
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

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
        cargarImagen carga1 = new cargarImagen("src/Personaje/1.gif");
        cargarImagen carga2 = new cargarImagen("src/Personaje/2.gif");
        cargarImagen carga3 = new cargarImagen("src/Personaje/3.gif");
        cargarImagen carga4 = new cargarImagen("src/Personaje/4.gif");
        Image imagen1 = carga1.img;
        Image imagen2 = carga2.img;
        
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
            int cont = 0 ;
            
            g.drawImage(imagen1, x, y, jueguito);
            System.out.println(y+" , "+x+" cont "+cont);
            if (cont>4){
                cont=0;
            }else{
                cont++;
            }
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