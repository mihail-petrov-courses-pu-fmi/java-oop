import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {
	
	private final int TILE_SIDE = 50;
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
			}
		}
		
		//g.setColor(Color.GREEN);
		//g.fillRect(10, 10, 100, 100);
	}
	
	private void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
}