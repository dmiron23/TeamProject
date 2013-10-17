package test.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends GraphicsObject {
	public Point p1;
	public Point p2;
	
	
	public Line(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
		alpha = 255;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(setColourTransparency(borderIdle,alpha));
		
		g.drawLine(p1.x, p1.y, p2.x, p2.y);

	}

	@Override
	public void handleMouse(int mx, int my) {
		// TODO Auto-generated method stub

	}


	@Override
	public void setAlpha(int a) {
		alpha = a;		
	}

}
