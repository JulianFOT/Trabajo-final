                  
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;            
import javax.swing.JButton;
import javax.swing.JPanel;

public class Juego extends JPanel{
    
    Personaje personaje1 = new Personaje(this);
    Obstaculo obstaculo1 = new Obstaculo(this);
    Obstaculo obstaculo2 = new Obstaculo(this);
    Obstaculo obstaculo3 = new Obstaculo(this);
    
    
    
    Fondo nubecita = new Fondo(this);
    
    public boolean juegoFinalizado=false;
    public JButton boton;
    private TAdapter tadapter;
    public int puntos = 0;
    
    public Juego() {
        tadapter = new TAdapter();
        boton = new JButton();
        setFocusable(true);
        setDoubleBuffered(true);
        this.addKeyListener(tadapter);
        
        
        obstaculo1.x=1300;
        obstaculo2.x=1600;
        obstaculo3.x=2000;
        
        
        try {
            Image img = ImageIO.read(getClass().getResource("../Fondo/Boton.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("no se imprimio ni mierda");
        }
        
        boton.addActionListener(tadapter);
        
         if(juegoFinalizado){
           remove(boton);
       }
       else
       {
            boton.setEnabled(true);
            boton.setVisible(true);
       }
       
	}
    
    
    
    
    void mover() {
        nubecita.mover();
        personaje1.mover();
        
        
        //obstaculo1.mover();
        obstaculo1.mover(obstaculo3.x);
        obstaculo2.mover(obstaculo1.x);
        obstaculo3.mover(obstaculo2.x);
        
    }
    

    @Override
    public void paintComponent(Graphics g) {
       
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
   
        dibujar(g2);
       
    }
    
    public void dibujar(Graphics2D g) {

        g.setColor(Color.BLUE);
        nubecita.paint(g); 

        g.setColor(Color.BLACK);
        personaje1.paint(g);
        
        
        g.setColor(Color.red);
        obstaculo1.paint(g);
        obstaculo2.paint(g);
        obstaculo3.paint(g);
        
        mover();
       
    }
    
    public void actualizar() {
      
    }
    
     private class TAdapter extends KeyAdapter implements ActionListener {
       
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

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
		    
        
     }

    
	public void finJuego() {
            juegoFinalizado=true; 
	}
}