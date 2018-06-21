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
	int imageRow = 3, imageColumn = 0;
	int panelWidth = 700, panelHeight = 650;
	public static BufferedImage rCat;
	public static BufferedImage [][] bkgdArray = new BufferedImage [4] [1]; 
	RareCatto c;
	ObjectManager objMana = new ObjectManager();
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdArray [0] [0] = ImageIO.read(this.getClass().getResourceAsStream("topframeww.png"));
		bkgdArray [1] [0] = ImageIO.read(this.getClass().getResourceAsStream("frame3.png"));
		bkgdArray [2] [0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-1.png"));
		bkgdArray [3] [0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
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
		
		if (e.getKeyCode() == KeyEvent.VK_A) {
			
			c.catX -= 10;
			
			if (imageRow == 2 && imageColumn == 0 && c.catY > 350 && c.catY < 395) {
				c.catX -= 10;
			}
			
			
			
			if (imageColumn == 0 && c.catX < 25) {
				c.catX += 10;
				
			}
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			c.catY += 10;
			
			//if (imageRow == 2 && imageColumn == 0 && c.catX > 0 && c.catX < 25  && c.catY > 400) {
			//	c.catY = 400;
			//}
			
			if (c.catY >= panelHeight && imageRow != 2) {
				imageRow++;
				c.catY = -12;
			}
			
			else if (imageRow == 3 && c.catY >= 575) {
				c.catY = 575;
			}
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_D) {
			c.catX += 10;
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_W && e.isShiftDown() == true) {
			c.catY -= 20;
			
			if (c.catY < -16) {
				imageRow--;
				c.catY = panelHeight;
			}
			
			if (imageRow == 0 && c.catY <= 575) {
				c.catY = 575;
			}
	}
		
		else if (e.getKeyCode() == KeyEvent.VK_W) {
			c.catY -= 10;
			
			if (c.catY < -16) {
				imageRow--;
				c.catY = panelHeight;
			}
			
			if (imageRow == 0 && c.catY <= 575) {
				c.catY = 575;
			}
		}
			
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
