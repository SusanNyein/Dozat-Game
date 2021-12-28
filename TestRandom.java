package YCCProject;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import YCCProject.ChangIcon.ImageFile;
public class TestRandom extends JFrame{
static int  a;
Image img;
private Image[] images=new Image[28];
int []index1={5,1,6,2,5,1,4,3,1,4,6,2,4,3,1,2,0,1,3,2,5,1,2,3,3,2,1,4};
int []index2={0,3,0,3,5,2,5,6,5,4,6,5,0,5,4,6,0,0,4,2,6,1,4,0,3,0,6,6};
int num1=0;
int num2=0;
private ImageFile f=new ImageFile();
Image[] image=f.getImages();
TestRandom (){
	final JButton b1=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b2=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b3=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b4=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b5=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b6=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b7=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b8=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b9=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b10=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b11=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b12=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b13=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b14=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b15=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b16=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b17=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b18=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b19=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b20=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b21=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b22=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b23=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b24=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b25=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b26=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b27=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	final JButton b28=new JButton(new ImageIcon(getClass().getResource("Reverse.png")));
	
	JPanel p1=new JPanel(new GridLayout(2,14));
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(b10);
	p1.add(b11);
	p1.add(b12);
	p1.add(b13);
	p1.add(b14);
	p1.add(b15);
	p1.add(b16);
	p1.add(b17);
	p1.add(b18);
	p1.add(b19);
	p1.add(b20);
	p1.add(b21);
	p1.add(b22);
	p1.add(b23);
	p1.add(b24);
	p1.add(b25);
	p1.add(b26);
	p1.add(b27);
	p1.add(b28);
	
	
	
	add(p1);
	
	
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b1.setIcon(new ImageIcon(img));
			image[a]=null;
		//	new ShowComfirmDialog();
			
			//b1.setEnabled(false);
		}
});

	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b2.setIcon(new ImageIcon(img));
			image[a]=null;
			
			//b1.setEnabled(false);
		}
});	
	
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b3.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b4.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	
	b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b5.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			
			b6.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b7.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b8.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b9.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b10.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b10.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});	
	b11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b11.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
});
	b12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b12.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	b13.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b13.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});		
	b14.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b14.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});
	
	b15.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b15.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	b16.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b16.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b17.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b17.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	b18.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b18.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b19.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b19.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b20.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b20.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b21.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b21.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b22.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b22.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	

	b23.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b23.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b24.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b24.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b25.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b25.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b26.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b26.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b27.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b27.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
	
	b28.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			a=(int)(Math.random()*28);
			Image img=image[a];
			while(img==null){
				a=(int)(Math.random()*28);
				 img=image[a];
			}
			System.out.println("index"+a);
			System.out.println(index1[a]);
			System.out.println(index2[a]);
			b28.setIcon(new ImageIcon(img));
			image[a]=null;
			//b1.setEnabled(false);
		}
	});	
}



public static void main(String[] args) {
		
		/*for(int i=1;i<=28;i++){
			a=(int)(Math.random()*28);
			System.out.print(i +" ");
			System.out.println(a);
		}*/
		
		TestRandom	frame =new TestRandom();
		frame.setTitle("TestRandom");
		frame.setSize(1200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	class ImageFile{
		ImageFile(){
		images[0]=new ImageIcon(getClass().getResource("FiveBlank.png")).getImage();
		images[1]=new ImageIcon(getClass().getResource("OneThree.png")).getImage();
		images[2]=new ImageIcon(getClass().getResource("SixBlank.png")).getImage();
		images[3]=new ImageIcon(getClass().getResource("TwoThree.png")).getImage();
		images[4]=new ImageIcon(getClass().getResource("FiveFive.png")).getImage();
		images[5]=new ImageIcon(getClass().getResource("OneTwo.png")).getImage();
		images[6]=new ImageIcon(getClass().getResource("FourFive.png")).getImage();
		images[7]=new ImageIcon(getClass().getResource("ThreeSix.png")).getImage();
		images[8]=new ImageIcon(getClass().getResource("OneFive.png")).getImage();
		images[9]=new ImageIcon(getClass().getResource("FourFour.png")).getImage();
		images[10]=new ImageIcon(getClass().getResource("SixSix.png")).getImage();
		images[11]=new ImageIcon(getClass().getResource("TwoFive.png")).getImage();
		images[12]=new ImageIcon(getClass().getResource("FourBlank.png")).getImage();
		images[13]=new ImageIcon(getClass().getResource("ThreeFive.png")).getImage();
		images[14]=new ImageIcon(getClass().getResource("OneFour.png")).getImage();
		images[15]=new ImageIcon(getClass().getResource("TwoSix.png")).getImage();
		images[16]=new ImageIcon(getClass().getResource("BlankBlank.png")).getImage();
		images[17]=new ImageIcon(getClass().getResource("OneBlank.png")).getImage();
		images[18]=new ImageIcon(getClass().getResource("ThreeFour.png")).getImage();
		images[19]=new ImageIcon(getClass().getResource("TwoTwo.png")).getImage();
		images[20]=new ImageIcon(getClass().getResource("FiveSix.png")).getImage();
		images[21]=new ImageIcon(getClass().getResource("OneOne.png")).getImage();
		images[22]=new ImageIcon(getClass().getResource("TwoFour.png")).getImage();
		images[23]=new ImageIcon(getClass().getResource("ThreeBlank.png")).getImage();
		images[24]=new ImageIcon(getClass().getResource("ThreeThree.png")).getImage();
		images[25]=new ImageIcon(getClass().getResource("TwoBlank.png")).getImage();
		images[26]=new ImageIcon(getClass().getResource("OneSix.png")).getImage();
		images[27]=new ImageIcon(getClass().getResource("FourSix.png")).getImage();
		}
		public Image[] getImages()
		{
			return images;
		}
	}

}
