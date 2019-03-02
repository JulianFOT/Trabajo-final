/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JulianFO
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Reproductor {
     
   
    
    public void Reproducir(String i) throws FileNotFoundException, IOException{
            FileInputStream f= new FileInputStream(i);
            AudioStream m =  new AudioStream(f);
            AudioPlayer.player.start(m);
    }
    
    public void Stop(String i) throws FileNotFoundException, IOException{
        FileInputStream f= new FileInputStream(i);
            AudioStream m =  new AudioStream(f);
            
           
    }
    
    
}
