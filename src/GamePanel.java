import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class GamePanel extends JPanel implements KeyListener {
	public int imageRow = 3, imageColumn = 0;
	final int speedyBoi = 25;
	int panelWidth = 700, panelHeight = 650;
	boolean ownBoat = true;
	String ownBoatS;
	public static BufferedImage rCat;
	public static BufferedImage raft;
	public static BufferedImage[][] bkgdArray = new BufferedImage[4][3];
	RareCatto c;
	Boat Raft;
	JTextArea inv = new JTextArea();
	

	// code for background

	public GamePanel() throws IOException {
		
		bkgdArray[0][0] = ImageIO.read(this.getClass().getResourceAsStream("topframeww.png"));
		bkgdArray[1][0] = ImageIO.read(this.getClass().getResourceAsStream("frame3.png"));
		bkgdArray[2][0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-1.png"));
		bkgdArray[3][0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		bkgdArray[0][1] = ImageIO.read(this.getClass().getResourceAsStream("for1.png"));
		bkgdArray[1][1] = ImageIO.read(this.getClass().getResourceAsStream("newmaze copy.png"));
		bkgdArray[2][1] = ImageIO.read(this.getClass().getResourceAsStream("rmid.png"));
		rCat = ImageIO.read(this.getClass().getResourceAsStream("jkrealboi.png"));
		raft = ImageIO.read(this.getClass().getResourceAsStream("boat.png"));
		c = new RareCatto();
		Raft = new Boat();
		new Dimension(700, 700);
		if (ownBoat = true) {
			ownBoatS = "Raft";
		}
		
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bkgdArray[imageRow][imageColumn], 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
		c.draw(g);
		if (imageRow == 1 && imageColumn == 1) {
			Raft.draw(g);
		}
		c.draw(g);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method s
		
		
		if(e.getKeyCode() ==  KeyEvent.VK_E) {
			inv.setText(ownBoatS);
			inv.setVisible(true);
		}

		if (e.getKeyCode() == KeyEvent.VK_A) {

			c.catX -= speedyBoi;

			if (imageRow == 2 && imageColumn == 0 && c.catY > 350 && c.catY < 395) {
				c.catX -= speedyBoi;
			}

			else if (imageColumn == 0 && c.catX < 25) {
				c.catX += speedyBoi;

			}
			
			else if (imageColumn != 0 && c.catX < 0) {
				imageColumn--;
				c.catX = 675;
			}

		}

		else if (e.getKeyCode() == KeyEvent.VK_S) {
			c.catY += speedyBoi;

			// if (imageRow == 2 && imageColumn == 0 && c.catX > 0 && c.catX < 25 && c.catY
			// > 400) {
			// c.catY = 400;
			// }

			if (c.catY >= panelHeight && imageRow != 3) {
				imageRow++;
				c.catY = -12;
			}

			else if (imageRow == 3 && c.catY >= 575) {
				c.catY = 575;
			}

		}

		else if (e.getKeyCode() == KeyEvent.VK_D) {
			c.catX += speedyBoi;
			
			if (imageColumn != 3 && c.catX >= 675) {
				imageColumn++;
				c.catX = -25;
			}
		}

		else if (e.getKeyCode() == KeyEvent.VK_W) {
			c.catY -= speedyBoi;

			if (c.catY < -10) {
				imageRow--;
				c.catY = panelHeight;
			}

			if (imageRow == 0 && c.catY <= 25) {
				c.catY = 25;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
