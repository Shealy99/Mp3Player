package mp3player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MainClass {

    FileInputStream fis;
    BufferedInputStream bis;
    public long pauseLocation = 0;
    public long songTotalLength = 0;
    public String fileLocation;
    private boolean infinite = false;

    public Player player;

    public void setInfinite(boolean state) {
        infinite = state;
    }

    public void stop() {
        if (player != null) {
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;
        }
    }

    public void pause() {
        if (player != null) {
            try {
                pauseLocation = fis.available();
                player.close();
            } catch (IOException ex) {

            }
        }
    }

    public void resume() {
        try {
            fis = new FileInputStream(fileLocation);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
            fis.skip(songTotalLength - pauseLocation - 1000);
        } catch (FileNotFoundException ex) {
        } catch (JavaLayerException ex) {
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread() {
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                }
            }
        }.start();
    }

    public void play(String path) {
        if (songTotalLength == 0 && pauseLocation == 0) {
            try {
                fis = new FileInputStream(path);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                songTotalLength = fis.available();
            } catch (FileNotFoundException | JavaLayerException ex) {
            } catch (IOException ex) {
            }
            fileLocation = path;
            new Thread() {
                public void run() {
                    try {
                        player.play();
                        if (player.isComplete() && infinite == true) {
                            play(fileLocation);
                        }
                    } catch (JavaLayerException ex) {
                    }
                }
            }.start();
        } else {
            resume();
        }
    }
}
