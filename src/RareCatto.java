import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class RareCatto {
	
	int catX = 300;
	int catY = 550;
	Robot r;

	public RareCatto() {
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update() {
		Point mousePoint = MouseInfo.getPointerInfo().getLocation();
		Point panelPoint = RunnerClass.bkgd.getLocationOnScreen();
		double cx = catX + panelPoint.getX() + 52;
		double cy = catY + panelPoint.getY() + 65;
		double cxm = mousePoint.getX();
		double cym = mousePoint.getY() + 50;
		Color color = r.getPixelColor((int)cx, (int)cy);
		System.out.println(color);
		
		//if (color == )
	}
	
	void paintComponent(Graphics g) {
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(GamePanel.rCat, catX, catY, 64, 64, null);
		
	}
	
}
