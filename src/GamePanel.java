import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	public static BufferedImage bkgdf1;
	ObjectManager objMana = new ObjectManager();
	RunnerClass runner;
	
	//main used to run. test only I'll probably change this later
	
	public static void main(String[] args) throws IOException {
		new GamePanel();
	}
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdf1 = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		new Dimension(700, 700);
		System.out.println(getWidth() + " " + getHeight());
	}
	@Override
	public void paintComponent(Graphics g) {
		drawGameState(g);
	}
	
	public void drawGameState(Graphics g) {
		g.drawImage(bkgdf1, 0, 0, runner.bkgdwidth, runner.bkgdheight, null);
		repaint();
		System.out.println("yo yo whaddup");
	}
}
