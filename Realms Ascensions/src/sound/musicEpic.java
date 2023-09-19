package sound;

/*Credits 

Music:
"Heroic Age" Kevin MacLeod (incompetech.com)
Licensed under Creative Commons: By Attribution 4.0 License
http://creativecommons.org/licenses/by/4.0/
*/

//Bibliotecas

//Sound
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;

//IO
import java.io.IOException;
import java.io.File;

public class musicEpic {

    
    private Clip clip;
    
    public musicEpic(String filepath){

        try {
            File audioFile = new File(filepath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
            // Lida com a exceção de forma apropriada para o seu caso
        }
    }

    public void playMusicMenu(){

          if (clip != null && !clip.isRunning()) {
            clip.setFramePosition(0); // Reinicia o áudio para o início
            clip.start(); // Inicia a reprodução do áudio
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void stopMusic(){

         if (clip != null && clip.isRunning()) {
            clip.stop(); // Para a reprodução do áudio
            clip.setFramePosition(0); // Reinicia o áudio para o início
        }
    }
}