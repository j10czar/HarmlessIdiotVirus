import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class popup extends Thread{
	
	private JLabel label;
	private JFrame frame;
	private JLabel image;
	private int myX;
	private int myY;
	
	public popup(int x, int y)
	{
		myX = x;
		myY = y;
		
		frame = new JFrame();
		Icon imgIcon = new ImageIcon(this.getClass().getResource("you.gif"));
		ImageIcon error = new ImageIcon(this.getClass().getResource("smile2.png"));
		
		
		image = new JLabel(imgIcon);
		frame.setTitle("you are an idiot");
		frame.setIconImage(error.getImage());
		frame.setBounds(x, y, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.getContentPane().add(image, "name_2775994580074600");
		frame.setVisible(true);
		frame.requestFocus();

	
	}
	public void run()
	{
		try {
			goCrazy();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void goCrazy() throws InterruptedException
	{
		int x = myX;
		int y = myY;
		Random rand = new Random();
		int random = rand.nextInt(3);
		
		if(random == 0)
		{
			for(int j = 0; j<30; j++)
			{
				for(int i = 0; i<30; i++)
				{
					x+=20;
					y+=20;
					frame.setBounds(x, y, 800, 600);
					Thread.sleep(200);
				}
				
				for(int i = 0; i<30; i++)
				{
					x-=20;
					y-=20;
					frame.setBounds(x, y, 800, 600);
					Thread.sleep(200);
				}
			}
		}
		else if(random == 1)
		{
			for(int j = 0; j<30; j++)
			{
				for(int i = 0; i<30; i++)
				{
					x-=20;
					y-=20;
					frame.setBounds(x, y, 800, 600);
					Thread.sleep(200);
				}
				
				for(int i = 0; i<30; i++)
				{
					x+=20;
					y+=20;
					frame.setBounds(x, y, 800, 600);
					Thread.sleep(200);
				}
				
			}
		}
			
			else if(random == 2)
			{
				for(int j = 0; j<30; j++)
				{
					for(int i = 0; i<30; i++)
					{
						x+=20;
						y-=20;
						frame.setBounds(x, y, 800, 600);
						Thread.sleep(200);
					}
					
					for(int i = 0; i<30; i++)
					{
						x-=20;
						y+=20;
						frame.setBounds(x, y, 800, 600);
						Thread.sleep(200);
					}
					
				}
			}
		
			else
			{
				for(int j = 0; j<30; j++)
				{
					
					for(int i = 0; i<30; i++)
					{
						x-=20;
						y+=20;
						frame.setBounds(x, y, 800, 600);
						Thread.sleep(200);
					}
					
					for(int i = 0; i<30; i++)
					{
						x+=20;
						y-=20;
						frame.setBounds(x, y, 800, 600);
						Thread.sleep(200);
					}
					
				}
			}
			
		}
		
		
	}

	
	



