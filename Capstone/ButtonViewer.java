import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.sound.sampled.*;
import java.io.*;
import java.awt.Font;
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 2000;
    private static final int FRAME_HEIGHT = 2000;
    
    private JFrame frame;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JPanel soundBoard;
    private JLabel currSong;
    
    public ButtonViewer()
    {
        frame = new JFrame();
        soundBoard = new JPanel();
        
        button = new JButton("JOHN CENA");
        button.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button);
        
        button2 = new JButton("AIRHORN");
        button2.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button2);
        
        button3 = new JButton("SILENCE");
        button3.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button3);
        
        button4 = new JButton("NO!!");
        button4.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button4);
        
        button5 = new JButton("D'OH");
        button5.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button5);
        
        button6 = new JButton("BATMAN");
        button6.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button6);
        
        button7 = new JButton("CAR HORN");
        button7.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button7);
        
        button8 = new JButton("CENSOR");
        button8.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button8);
        
        button9 = new JButton("OLD SPICE");
        button9.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button9);
        
        button10 = new JButton("DUCK");
        button10.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button10);
        
        button11 = new JButton("JUST DO IT");
        button11.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button11);
        
        button12 = new JButton("SHUT UP");
        button12.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button12);
        
        
        currSong = new JLabel();
        soundBoard.add(currSong);
        
        frame.add(soundBoard);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);
        button11.addActionListener(listener);
        button12.addActionListener(listener);
        
        button.setFont(new Font("Arial", Font.PLAIN, 50));
        button2.setFont(new Font("Arial", Font.PLAIN, 50));
        button3.setFont(new Font("Arial", Font.PLAIN, 50));
        button4.setFont(new Font("Arial", Font.PLAIN, 50));
        button5.setFont(new Font("Arial", Font.PLAIN, 50));
        button6.setFont(new Font("Arial", Font.PLAIN, 50));
        button7.setFont(new Font("Arial", Font.PLAIN, 50));
        button8.setFont(new Font("Arial", Font.PLAIN, 50));
        button9.setFont(new Font("Arial", Font.PLAIN, 50));
        button10.setFont(new Font("Arial", Font.PLAIN, 50));
        button11.setFont(new Font("Arial", Font.PLAIN, 50));
        button12.setFont(new Font("Arial", Font.PLAIN, 50));
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
    
    public class ClickListener implements ActionListener
    {
        private int count;
        private Clip clip;
        private AudioInputStream audioInputStream;
        
        public ClickListener()
        {
            count = 0;
        }
        
        public void actionPerformed(ActionEvent event)
        {       
            try
            {
                String soundName = "";
                switch(event.getActionCommand()){
                    case "JOHN CENA":
                    soundName="Cena.wav";
                    break;
                    case "AIRHORN":
                    soundName="Airhorn.wav";
                    break;
                    case "SILENCE":
                    soundName="Silence.wav";
                    break;
                    case "NO!!":
                    soundName="No.wav";
                    break;
                    case "D'OH":
                    soundName="D'oh.wav";
                    break;
                    case "BATMAN":
                    soundName="Batman.wav";
                    break;
                    case "CAR HORN":
                    soundName="Carhorn.wav";
                    break;
                    case "CENSOR":
                    soundName="Censor.wav";
                    break;
                    case "OLD SPICE":
                    soundName="Oldspice.wav ";
                    break;
                    case "DUCK":
                    soundName="Duck.wav";
                    break;
                    case "JUST DO IT":
                    soundName="JustDoIt.wav";
                    break;
                    case "SHUT UP":
                    soundName="ShutUp.wav";
                    break;
                }
                if (clip !=null && clip.isRunning())
                {
                    clip.stop();
                    clip.close();
                }
                audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                clip=(Clip)AudioSystem.getLine(new DataLine.Info(Clip.class,audioInputStream.getFormat())); 
                
                clip.open(audioInputStream);
                clip.start();
                
            }

            catch(Exception exc)
            {
                exc.printStackTrace();                
                clip.close();

            }
        }
    }
    

}