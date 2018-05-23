import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;

public class RunnerClass {

	final static int bkgdheight = 700;
	final static int bkgdwidth = 700;
	JFrame bkgd = new JFrame();
	
	public static void main(String[] args) {
		new RunnerClass();
	}
	
	public RunnerClass() {
		
		
		GamePanel gamePanel = null;
		try {
			gamePanel = new GamePanel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bkgd.add(gamePanel);
		bkgd.addKeyListener(gamePanel);
		bkgd.setDefaultCloseOperation(3);
		bkgd.setSize(bkgdwidth, bkgdheight);
		bkgd.setVisible(true);
		
		
	}
}
