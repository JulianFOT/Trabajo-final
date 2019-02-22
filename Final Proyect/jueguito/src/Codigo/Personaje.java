package Codigo;


import Codigo.Juego;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;




public abstract class Personaje {
   
	int ancho = 50;
	int alto = 50;
	int x;
        int y;
	int x1 = 0;  
        int y1=0;
	private final Juego jueguito;
        boolean saltando=false;
        boolean sube=false;
        boolean baja=false;
        Image Imagen;

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

	

	
        
	public Rectangle getBounds() 
        {
		return new Rectangle(x+5, y+y1, ancho, alto);
                
	}
        public void keyPressed(KeyEvent e) 
        {
		
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            {
                saltando=true;
            }
        }
        
        public int getX()
        {
        return x;
        }

        public int getY() 
        {
        return y;
        }
        public Image getImagen() 
        {
        return Imagen;
        }
        
        
}