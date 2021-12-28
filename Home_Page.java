package YCCProject;
import java.awt.*;
import sun.awt.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.image.ImageConsumer;
import java.io.IOException;
import java.net.URL;
public class Home_Page1 extends JFrame{
	JLabel l=new JLabel(new ImageIcon(getClass().getResource("DozatHome.png")));
	JButton quick=new JButton(new ImageIcon(getClass().getResource("Quit2.png")));
	JButton play=new JButton(new ImageIcon(getClass().getResource("Play2.png")));
	Clip clip;
	Home_Page1(){
	try{
		URL url=this.getClass().getClassLoader().getResource("AvrilLavignePushRingtone.wav");
		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
		 clip=AudioSystem.getClip();
		 clip.open(audioIn);
		 clip.loop(100);
		 clip.start();
	}catch(UnsupportedAudioFileException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}catch(LineUnavailableException e){
		e.printStackTrace();
	}
	
	Image icon=new ImageIcon("Icon.png").getImage();
	final Color c=new Color(255,0,128);
	
	JPanel p2=new JPanel(new GridLayout(1,2,5,5));
	play.setBackground(Color.BLACK);
	quick.setBackground(Color.BLACK);
	play.setAlignmentX((float) 0.0);
	quick.setAlignmentX((float) 0.0);
	play.setBorderPainted(false);
	quick.setBorderPainted(false);
	play.setSelected(true);
	quick.setSelected(true);
		p2.add(play);
		p2.add(quick);
	
		play.setBorderPainted(false);
		quick.setBorderPainted(false);
		p2.setBackground(Color.BLACK);
		p2.setAlignmentX((float)0.0);
		p2.setBorder(null);
		
		JPanel p1=new JPanel(new BorderLayout());
		p1.add(l,BorderLayout.CENTER);
		
		
		JPanel addPanel=new JPanel(new BorderLayout());
		addPanel.add(p1,BorderLayout.NORTH);
		addPanel.add(p2,BorderLayout.SOUTH);
		
	
	
		add(addPanel);
		
		play.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			clip.stop();
			Perfect_Playing_DozatGame1  frame=new Perfect_Playing_DozatGame1();
			frame.setSize(1370,730);
			frame.setTitle("Perfect_Playing_DozatGame");
			frame.setVisible(true);	
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			Image icon=new ImageIcon("Icon.png").getImage();
			frame.setIconImage(icon);
			frame.setResizable(false);
		
		}
		});
		quick.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
				clip.stop();
			}
			});
	}
	public static void main(String[] args){
		Home_Page1 h=new Home_Page1();
		h.setVisible(true);
		h.setTitle("DozatGame");
		h.setSize(1250,650);
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setLocationRelativeTo(null);
		Image icon=new ImageIcon("Icon.png").getImage();
		h.setIconImage(icon);
		h.setResizable(false);
	}

}
