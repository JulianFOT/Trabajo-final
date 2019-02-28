
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public class Obstaculo {
        int ancho = 20;
	int alto = 50;
	int x = 1300;
	int y = 350;
	int x1 = -5;
         int cont = 0 ;
	
	private Juego jueguito;
        cargarImagen carga1 = new cargarImagen("src/Obstaculo/1.png");
        cargarImagen carga2 = new cargarImagen("src/Obstaculo/2.png");
        cargarImagen carga3 = new cargarImagen("src/Obstaculo/3.png");
        cargarImagen carga4 = new cargarImagen("src/Obstaculo/4.png");
        cargarImagen carga5 = new cargarImagen("src/Obstaculo/5.png");
        cargarImagen carga6 = new cargarImagen("src/Obstaculo/6.png");
        cargarImagen carga7 = new cargarImagen("src/Obstaculo/7.png");
        cargarImagen carga8 = new cargarImagen("src/Obstaculo/8.png");
        
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
             cont++;
            Image imagen;
            if(cont/7==1 )
            {
                imagen = carga8.img ;
            }else
            {
                if(cont/7==2 )
                {
                    imagen= carga7.img ;
                }
                else
                {
                    if(cont/7==3 )
                    {
                        imagen = carga6.img ;
                    }
                    else
                    {
                        if(cont/7==4 ) 
                        {   imagen = carga5.img ;
                        }
                        if (cont>=28)
                        {
                            cont=1;
                        }
                        if (y >= 330)
                        {
                            imagen = carga4.img ;
                        }
                        else
                        {
                            imagen = carga3.img ;
                        }
                    }
                    
                }
            }
              
              g.drawImage(imagen, x-20, y-40, ancho+60, alto+40, jueguito);
        
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, ancho, alto);
        }
}