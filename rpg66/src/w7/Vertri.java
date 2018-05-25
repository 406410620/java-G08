package w7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Vertri extends Shapes {
	
	public Vertri(int x1, int y1, int x2, int y2,  Color color, Boolean filled) {
		super(x1,y1,x2,y2,color,filled);
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		int[] xvalue= {x1,x2,x2};
		int[] yvalue= {y1,y2,y1};
		Polygon polygon1 = new Polygon( xvalue, yvalue, 3);
		if(filled) {
			g2d.drawPolygon(polygon1);
		}
		else {
			g2d.fillPolygon(xvalue,yvalue,3);
		}
	}
}
