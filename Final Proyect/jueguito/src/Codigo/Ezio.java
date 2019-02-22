package Codigo;


import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Ezio extends Personaje{
    
        int contador=0;
        Image[] correr = {
            new ImageIcon(getClass().getResource("../Personaje/k1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k3.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k4.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k5.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k6.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k7.png")).getImage(),
            new ImageIcon(getClass().getResource("../Personaje/k8.png")).getImage()        
        };

    public Ezio(Juego jueguito) {
        super(jueguito); 
       x=10;
       y=350;
    }
    
    

   
     
        
    public void move()
    {
        for(contador=0;contador<8;contador++)
        {
            Imagen = correr[contador];
        }
            
    }
    
    
        
    @Override
    public void keyPressed(KeyEvent e) {
		
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            {
                
                saltando=true;
            }
    }
}
