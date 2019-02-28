
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        //
        JFrame ventana = new JFrame("Jueguito");
        ventana.setResizable(false);
        Juego jueguito = new Juego();
        ventana.add(jueguito);
	ventana.setSize(1300,425);
	ventana.setLocation(70,200 );
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setCursor(1);
        
	
        while (!jueguito.juegoFinalizado) {  
            jueguito.repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jueguito.repaint();
    }
}
