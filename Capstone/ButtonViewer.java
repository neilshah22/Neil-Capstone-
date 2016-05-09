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
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
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
        
        button13 = new JButton("SHIA LA BEOUF");
        button13.setPreferredSize(new Dimension(500,150));
        soundBoard.add(button13);
        
        button14 = new JButton("T-REX");
        button14.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button14);
        
        button15 = new JButton("GUN SHOT");
        button15.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button15);
        
        button16 = new JButton("R2D2 SCREAM");
        button16.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button16);
        
        button17 = new JButton("WILHELM SCREAM");
        button17.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button17);
        
        button18 = new JButton("CRICKETS");
        button18.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button18);
        
        button19 = new JButton("DRUM ROLL");
        button19.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button19);
        
        button20 = new JButton("SAD TROMBONE");
        button20.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button20);
        
        button21 = new JButton("DEEZ NUTS");
        button21.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button21);
        
        button22 = new JButton("20th CENTURY FOX (RE)");
        button22.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button22);
        
        button23 = new JButton("I AM YOUR FATHER");
        button23.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button23);
        
        button24 = new JButton("DANIEL");
        button24.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button24);
        
        button25 = new JButton("DUN DUN DUN");
        button25.setPreferredSize(new Dimension(500, 150));
        soundBoard.add(button25);
        
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
        button13.addActionListener(listener);
        button14.addActionListener(listener);
        button15.addActionListener(listener);
        button16.addActionListener(listener);
        button17.addActionListener(listener);
        button18.addActionListener(listener);
        button19.addActionListener(listener);
        button20.addActionListener(listener);
        button21.addActionListener(listener);
        button22.addActionListener(listener);
        button23.addActionListener(listener);
        button24.addActionListener(listener);
        button25.addActionListener(listener);
        
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
        button13.setFont(new Font("Arial", Font.PLAIN, 50));
        button14.setFont(new Font("Arial", Font.PLAIN, 50));
        button15.setFont(new Font("Arial", Font.PLAIN, 50));
        button16.setFont(new Font("Arial", Font.PLAIN, 50));
        button17.setFont(new Font("Arial", Font.PLAIN, 50));
        button18.setFont(new Font("Arial", Font.PLAIN, 50));
        button19.setFont(new Font("Arial", Font.PLAIN, 50));
        button20.setFont(new Font("Arial", Font.PLAIN, 50));
        button21.setFont(new Font("Arial", Font.PLAIN, 50));
        button22.setFont(new Font("Arial", Font.PLAIN, 30));
        button23.setFont(new Font("Arial", Font.PLAIN, 40));
        button24.setFont(new Font("Arial", Font.PLAIN, 50));
        button25.setFont(new Font("Arial", Font.PLAIN, 50));
        
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
                    case "SHIA LA BEOUF":
                    soundName="ShiaLaBeouf.wav";
                    break;
                    case "T-REX":
                    soundName="T_Rex.wav";
                    break;
                    case "GUN SHOT":
                    soundName="GunShot.wav";
                    break;
                    case "R2D2 SCREAM":
                    soundName="R2D2Scream.wav";
                    break;
                    case "WILHELM SCREAM":
                    soundName="WilhelmScream.wav";
                    break;
                    case "CRICKETS":
                    soundName="Crickets.wav";
                    break;
                    case "DRUM ROLL":
                    soundName="DrumRoll.wav";
                    break;
                    case "SAD TROMBONE":
                    soundName="SadTrombone.wav";
                    break;
                    case "DEEZ NUTS":
                    soundName="DeezNuts.wav";
                    break;
                    case "20th CENTURY FOX (RE)":
                    soundName="20thCenturyRecorder.wav";
                    break;
                    case "I AM YOUR FATHER":
                    soundName="IAmYourFather.wav";
                    break;
                    case "DANIEL":
                    soundName="Daniel.wav";
                    break;
                    case "DUN DUN DUN":
                    soundName="DunDunDun.wav";
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