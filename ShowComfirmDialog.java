package YCCProject;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShowComfirmDialog extends JFrame{
	static int value=0;
	ShowComfirmDialog(){
		value=JOptionPane.showConfirmDialog(null,"Are you  play next time?","For Play Next Time",JOptionPane.YES_NO_OPTION);

		if(value==JOptionPane.YES_OPTION){
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
		else{
			System.exit(0);
		}	
	}
	public static void main(String[] args) {
		ShowComfirmDialog frame=new ShowComfirmDialog();
	}

}
