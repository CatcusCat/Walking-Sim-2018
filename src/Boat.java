import java.awt.Graphics;

public class Boat {

	int boatX = 465;
	int boatY = 300;
	
	public Boat(){
		
	
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(GamePanel.raft, boatX, boatY, 64, 64, null);
	}
}
