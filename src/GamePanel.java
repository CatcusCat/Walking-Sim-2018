import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	public static BufferedImage bkgdf1;
	public static BufferedImage bkgdf1two;
	public static BufferedImage rCat;
	public static BufferedImage bkgdArray [] []  = {{bkgdf1two}, {bkgdf1}};
	RareCatto c;
	ObjectManager objMana = new ObjectManager();
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdf1 = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		bkgdf1two = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-1.png"));
		rCat = ImageIO.read(this.getClass().getResourceAsStream("CattoSprite (2).png"));
		c = new RareCatto();
		new Dimension(700, 700);
		System.out.println(getWidth() + " " + getHeight());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		drawGameFrame1Two(g);
		
		if (c.catY == 0) {
		drawGameFrame1Two(g);
		c.catY = 700;
		repaint();
		}
	}
	
	public void drawGameFrame1(Graphics g) {
		g.drawImage(bkgdf1, 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
		c.draw(g);
		repaint();
	}
	
	public void drawGameFrame1Two(Graphics g) {
		g.drawImage(bkgdf1two, 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
		c.draw(g);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == KeyEvent.VK_A) {
			c.catX -= 12;
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_S) {
			c.catY += 12;
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_D) {
			c.catX += 12;
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_W) {
			c.catY -= 12;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
