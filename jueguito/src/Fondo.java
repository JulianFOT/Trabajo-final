
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Fondo {
        //Variables de tamaño del fondo
        int ancho_fondo = 1300;
	int alto_fondo = 400;
        //Coordenadas iniciales para mover el fondo
        int x1=1300;
        int y1=0;
	//Coordenadas secundariasque mueven otro fondo
        int x2 = 0;
        int y2 = 0;
        //objeto de la clase juego
        private Juego jueguito;

	public Fondo (Juego jueguito) {
		this.jueguito= jueguito;
	}
        
	public void mover() {
            
          
            x1 = x1 - 2;
            x2 = x2 - 2;
            
            
            if (x1==0 & x2==-1300 )
            {
                
                x1=1300;
                x2 = 0;
            }
                
            
        }

	public void paint(Graphics2D g) {
            ImageIcon imagenFondo =new ImageIcon(getClass().getResource("/Imagenes/1Fondo.png"));
            ImageIcon imagenFondo2 =new ImageIcon(getClass().getResource("/Imagenes/2Fondo.png"));
            ImageIcon imagenFondo3 =new ImageIcon(getClass().getResource("/Imagenes/3Fondo.png"));
            ImageIcon imagenFondo4 =new ImageIcon(getClass().getResource("/Imagenes/4Fondo.png"));
            g.drawImage(imagenFondo.getImage(), x1, y1,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo.getImage(), x2, y2,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo2.getImage(), x1, y1,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo2.getImage(), x2, y2,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo3.getImage(), x1, y1,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo3.getImage(), x2, y2,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo4.getImage(), x1, y1,ancho_fondo,alto_fondo,null);
            g.drawImage(imagenFondo4.getImage(), x2, y2,ancho_fondo,alto_fondo,null);
        }
	
	
    
}