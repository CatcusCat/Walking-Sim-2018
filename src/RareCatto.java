import java.awt.Graphics;

public class RareCatto extends ObjectManager{
	
	int catX = 300;
	int catY = 550;

	public RareCatto() {
		
	}
	
	public void update() {
		
	}
	
	void paintComponent(Graphics g) {
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(GamePanel.rCat, catX, catY, 64, 64, null);

	}
	
}
