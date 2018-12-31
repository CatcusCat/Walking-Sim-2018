import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.text.JTextComponent;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
	public int imageRow = 3, imageColumn = 0;
	final int speedyBoi = 1;
	int panelWidth = 700, panelHeight = 650;
	boolean ownBoat = false;
	boolean left = false, right = false, up = false, down = false;
	String ownBoatS;
	static final int FPS = 240;

	public static BufferedImage rCat;
	public static BufferedImage raft;
	public static BufferedImage[][] bkgdArray = new BufferedImage[4][3];
	RareCatto c;
	Boat Raft;
	JTextArea inv = new JTextArea();

	// code for background

	public GamePanel() throws IOException {

		Timer t = new Timer(1000 / FPS, this);

		bkgdArray[0][0] = ImageIO.read(this.getClass().getResourceAsStream("topframeww.png"));
		bkgdArray[1][0] = ImageIO.read(this.getClass().getResourceAsStream("frame3.png"));
		bkgdArray[2][0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-1.png"));
		bkgdArray[3][0] = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		bkgdArray[0][1] = ImageIO.read(this.getClass().getResourceAsStream("for1.png"));
		bkgdArray[1][1] = ImageIO.read(this.getClass().getResourceAsStream("newmaze copy.png"));
		bkgdArray[2][1] = ImageIO.read(this.getClass().getResourceAsStream("rmid.png"));
		bkgdArray[3][1] = ImageIO.read(this.getClass().getResourceAsStream("bigfor.png"));
		bkgdArray[0][2] = ImageIO.read(this.getClass().getResourceAsStream("despacito.png"));
		bkgdArray[1][2] = ImageIO.read(this.getClass().getResourceAsStream("joyceispoopy.png"));
		bkgdArray[2][2] = ImageIO.read(this.getClass().getResourceAsStream("poop.png"));
		bkgdArray[3][2] = ImageIO.read(this.getClass().getResourceAsStream("dootdootdootdootdootdootdooo.png"));
		rCat = ImageIO.read(this.getClass().getResourceAsStream("jkrealboi.png"));
		raft = ImageIO.read(this.getClass().getResourceAsStream("boat.png"));
		c = new RareCatto();
		Raft = new Boat();
		new Dimension(700, 700);

		t.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bkgdArray[imageRow][imageColumn], 0, 0, RunnerClass.bkgdwidth, RunnerClass.bkgdheight, null);
		c.draw(g);
		repaint();
		c.update();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method s

		if (e.getKeyCode() == KeyEvent.VK_E) {
			inv.setText(ownBoatS);
			inv.setVisible(true);
		}

		if (e.getKeyCode() == KeyEvent.VK_A) {
			left = true;

		}

		if (e.getKeyCode() == KeyEvent.VK_S) {

			down = true;

		}

		else if (e.getKeyCode() == KeyEvent.VK_D) {

			right = true;

		}

		if (e.getKeyCode() == KeyEvent.VK_W) {

			up = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_A) {

			left = false;

		}

		if (e.getKeyCode() == KeyEvent.VK_S) {

			down = false;

		}

		if (e.getKeyCode() == KeyEvent.VK_D) {

			right = false;

		}

		if (e.getKeyCode() == KeyEvent.VK_W) {

			up = false;

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// timer tick
		if (left == true) {

			c.catX -= speedyBoi;

			if (c.catX < -10) {
				imageColumn--;
				c.catX = 674;
			}

			if (imageColumn == 0 && c.catX < 25) {
				c.catX = 25;
			}
		}

		if (up == true) {

			c.catY -= speedyBoi;

			if (c.catY < -10) {
				imageRow--;
				c.catY = panelHeight;
			}

			if (imageRow == 0 && c.catY <= 25) {
				c.catY = 25;
			}
		}

		if (down == true) {
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

		if (right == true)

			c.catX += speedyBoi;

		if (imageColumn != 3 && c.catX >= 675) {
			imageColumn++;
			c.catX = -25;
		}
	}

}
