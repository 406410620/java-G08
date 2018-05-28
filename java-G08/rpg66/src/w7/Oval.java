package w7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval extends Shapes {

	public Oval(int x1, int y1, int x2, int y2, Color color, Boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(filled){
			g2d.setColor(color);
			g2d.fillOval(Math.min(x1, x2),Math.min(y1, y2), Math.abs(x1-x2),Math.abs(y1-y2));
		}
		else{
			g2d.setColor(color);
			g2d.drawOval(Math.min(x1, x2),Math.min(y1, y2), Math.abs(x1-x2),Math.abs(y1-y2));
		}
	}

}
