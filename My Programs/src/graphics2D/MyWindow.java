package graphics2D;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class MyWindow extends JFrame implements KeyListener {

	int width = 500;
	int height = 500;
	Hero Aizen;
	
	Hero Potion;
	private BufferedImage landscape;

	public static void main(String[] args) {
		new MyWindow();

	}

	public MyWindow() {
		Aizen = new Hero("Aizen","/images/heroes/aizen.png", 200, 200);
		Potion = new Hero("Potion","/images/heroes/potion.png", 300, 300);
		setVisible(true);
		setSize(width, height);
		setLocation(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		landscape = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D) landscape.getGraphics();
		paint(g2);
		g2.fillRect(0, 0, width, height);
		
		if (Math.abs(Aizen.getX() - Potion.getX())+Math.abs(Aizen.getY()-Potion.getY())<10){
			
		}
	}

	public void paint(Graphics g) {
		
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		
		
		
		
		
		g2.drawImage(Aizen.getImage(), Aizen.getX(), Aizen.getY(), null);
		g.drawImage(image,180,100,null);
		
		g2.drawImage(Potion.getImage(), Potion.getX(), Potion.getY(), null);
		g.drawImage(image,200,100,null);
	}
	
	public void keyPressed(KeyEvent arg0){
		int key = arg0.getKeyCode();
		if(key == KeyEvent.VK_UP){
			Aizen.moveUp();
		}
		if(key == KeyEvent.VK_DOWN){
			Aizen.moveDown();
		}
		if(key == KeyEvent.VK_RIGHT){
			Aizen.moveRight();
		}
		if(key == KeyEvent.VK_LEFT){
			Aizen.moveLeft();
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent arg0){
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
