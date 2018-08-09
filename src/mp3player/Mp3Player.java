package mp3player;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Mp3Player extends javax.swing.JFrame {
    
    private int mouseX, mouseY;
    private MainClass player;
    
    public Mp3Player() {
        initComponents();
        setLocationRelativeTo(null);
        player = new MainClass();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stop = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        pause = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        infiniteLoop = new javax.swing.JPanel();
        loop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Webp.net-resizeimage (2).png"))); // NOI18N
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
        });
        jPanel1.add(stop);
        stop.setBounds(50, 50, 33, 33);

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Webp.net-resizeimage.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        jPanel1.add(play);
        play.setBounds(90, 40, 64, 60);

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/settings (1).png"))); // NOI18N
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        jPanel1.add(settings);
        settings.setBounds(200, 50, 30, 30);

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Webp.net-resizeimage (1).png"))); // NOI18N
        pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseMouseClicked(evt);
            }
        });
        jPanel1.add(pause);
        pause.setBounds(160, 50, 33, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 200, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/x.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 10, 20, 20);

        infiniteLoop.setBackground(new java.awt.Color(26, 26, 26));

        loop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/settings (2).png"))); // NOI18N
        loop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout infiniteLoopLayout = new javax.swing.GroupLayout(infiniteLoop);
        infiniteLoop.setLayout(infiniteLoopLayout);
        infiniteLoopLayout.setHorizontalGroup(
            infiniteLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infiniteLoopLayout.createSequentialGroup()
                .addComponent(loop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        infiniteLoopLayout.setVerticalGroup(
            infiniteLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infiniteLoopLayout.createSequentialGroup()
                .addComponent(loop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(infiniteLoop);
        infiniteLoop.setBounds(10, 50, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
    
    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        player.play("C:\\Users\\Acer\\Downloads\\DJ Shadow - Scale It Back feat. Little Dragon (Robotaki Remix).mp3");
        File file = new File("C:\\Users\\Acer\\Downloads\\DJ Shadow - Scale It Back feat. Little Dragon (Robotaki Remix).mp3");
        title.setText(file.getName() + "");
        
    }//GEN-LAST:event_playMouseClicked
    
    private void pauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseClicked
        player.pause();
    }//GEN-LAST:event_pauseMouseClicked
    
    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        player.stop();
    }//GEN-LAST:event_stopMouseClicked
    
    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
        JFileChooser chooser = new JFileChooser("C:\\Users\\Acer\\Downloads");
        chooser.addChoosableFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
            
            String name = chooser.getSelectedFile().getName();
            title.setText(name);
            player.play(song);
        }
    }//GEN-LAST:event_settingsMouseClicked
    
    private boolean loopState = true;
    private void loopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loopMouseClicked
        player.setInfinite(loopState);
        loopState = (loopState) ? false : true;
        if (loopState) {
            infiniteLoop.setBackground(new Color(26, 26, 26));
            
        } else {
            infiniteLoop.setBackground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_loopMouseClicked
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mp3Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel infiniteLoop;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loop;
    private javax.swing.JLabel pause;
    private javax.swing.JLabel play;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel stop;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
