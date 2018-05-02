import java.awt.Graphics;

public class RareCatto extends ObjectManager{
	

	int catX;
	int catY;

	public RareCatto(int catX, int catY) {
		this.catX = catX;
		this.catY = catY;
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(GamePanel.rCat, 0, 0, 64, 64, null);
	}
}
