import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GamePanel {
	JFrame bkgd = new JFrame();
	final static int bkgdheight = 700;
	final static int bkgdwidth = 700;
	public static BufferedImage bkgdf1;
	
	
	//main used to run. test only I'll probably change this later
	
	public static void main(String[] args) throws IOException {
		new GamePanel();
	}
	
	//code for background
	
	public GamePanel() throws IOException {
		bkgdf1 = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
		bkgd.setSize(bkgdheight, bkgdwidth);
	}
}
