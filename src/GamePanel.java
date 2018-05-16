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
	public static BufferedImage rCat;
	RareCatto c;
	ObjectManager objMana = new ObjectManager();
	
	//main used to run. test only I'll probably change this later
	
	public static void main(String[] args) throws IOException {
		new GamePanel();
	}
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdf1 = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		rCat = ImageIO.read(this.getClass().getResourceAsStream("CattoSprite (2).png"));
		c = new RareCatto();
		new Dimension(700, 700);
		System.out.println(getWidth() + " " + getHeight());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		drawGameState(g);
		repaint();
	}
	
	public void drawGameState(Graphics g) {
		g.drawImage(bkgdf1, 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
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
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
