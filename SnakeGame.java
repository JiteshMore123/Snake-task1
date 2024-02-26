import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SnakeGame extends JPanel{

	private class Title{
		int x;
		int y;
		
		Title(int i, int j) {
		   this.x= x;
		   this.y= y;
		}
		
	}
	
	int boardWidth;
	int boardHeight;
	int titleSize = 25;
	
	Title snakeHead;
	
	SnakeGame(int boardHeight2, int boardWidth2) {
		this.boardWidth= boardWidth;
	    this.boardHeight= boardHeight;
	    
	    setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
	    setBackground(Color.black);
	    
	    snakeHead = new Title(5, 5);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		for(int i=0;i<boardWidth/titleSize;i++) {
			g.drawLine(i*titleSize, 0, i*titleSize, boardHeight);
			g.drawLine(0, i*titleSize, boardWidth, i*titleSize);
		}
		g.setColor(Color.green);
		g.fillRect(snakeHead.x * titleSize, snakeHead.y * titleSize, titleSize, titleSize);
		
	}
	
}
