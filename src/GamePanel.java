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
	int imageRow = 0, imageColumn = 0;
	int panelWidth = 700, panelHeight = 650;
	public static BufferedImage rCat;
	public static BufferedImage [][] bkgdArray = new BufferedImage [2] [1]; 
	RareCatto c;
	ObjectManager objMana = new ObjectManager();
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdArray [0] [0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-1.png"));
		bkgdArray [1] [0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		rCat = ImageIO.read(this.getClass().getResourceAsStream("CattoSprite (2).png"));
		c = new RareCatto();
		new Dimension(700, 700);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bkgdArray [imageRow] [imageColumn], 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
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
			c.catX -= 10;
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_S) {
			c.catY += 10;
			
			if (c.catY >= panelHeight && imageRow != 1) {
				imageRow++;
				c.catY = -12;
			}
			
			else if (imageRow == 1 && c.catY >= 575) {
				c.catY = 575;
			}
			
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_D) {
			c.catX += 10;
		}
		
		else if (e.getKeyChar() == KeyEvent.VK_W) {
			c.catY -= 10;
			
			if (c.catY < -16) {
				imageRow--;
				c.catY = panelHeight;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
