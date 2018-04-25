import java.io.IOException;

import javax.swing.JFrame;

public class RunnerClass {

	final int bkgdheight = 700;
	final int bkgdwidth = 700;
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
		bkgd.setSize(bkgdheight, bkgdwidth);
		bkgd.setVisible(true);
	}
	
}
