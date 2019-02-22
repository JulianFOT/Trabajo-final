package Codigo;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Juego extends JPanel{
    
    private final Ezio Ezio;
    
     
    Personaje personaje1 = new Personaje(this) {};
    Obstaculo obstaculo1 = new Obstaculo(this);
    Fondo nubecita = new Fondo(this);
    
    public boolean juegoFinalizado=false;
    public int puntos = 0;
    
    public Juego() 
    {
        Ezio = new Ezio();
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje1.keyPressed(e);
            }
		});
        setFocusable(true);
        
        
    }
    
    
    
    @Override
     public void paint(Graphics g) {
    
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawImage(escena, 0 , 0 , this);
        if (juegoFinalizado) {
          
            g2d.drawImage(Ezio.getImagen(), Ezio.getX(), Ezio.getY(), this);
            
        } else {
            //g2d.drawImage(escena, 0 , 0 , this);
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    void mover() {
        personaje1.mover();
        obstaculo1.mover();
        nubecita.mover();
    }
    
    @Override
    public void paintComponent(Graphics g) {
       
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);
    }
    
    public void dibujar(Graphics2D g) {
        
        g.setColor(Color.BLUE);
        nubecita.paint(g); 
        g.setColor(Color.red);
        obstaculo1.paint(g);
        
        mover();
    }
    
    public void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.MAGENTA);
        g1.drawString("Puntaje:  "+puntos, 510, 30);
        
        if(juegoFinalizado)
        {
            g2.setColor(Color.red);
            g2.drawString("¡¡¡ Haz Perdido !!!", ((float) getBounds().getCenterX() /2)+50 , 70);
        }
    }
    
	public void finJuego() {
            juegoFinalizado=true;
	}
}