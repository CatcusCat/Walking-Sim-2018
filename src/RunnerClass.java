import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;

public class RunnerClass implements KeyListener {

	final static int bkgdheight = 700;
	final static int bkgdwidth = 700;
	boolean left = false;
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
		bkgd.addKeyListener(this);
		bkgd.setDefaultCloseOperation(3);
		bkgd.setSize(bkgdwidth, bkgdheight);
		bkgd.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyChar() == KeyEvent.VK_A) {
			left = true;
		}
		
		if (left == true) {
			RareCatto.catX -= 8;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
	}
	
	
	
}
