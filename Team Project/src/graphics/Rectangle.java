package graphics;

import java.awt.Graphics2D;
import java.awt.Point;

public class Rectangle extends GraphicsObject {
	
	public Rectangle(int _x, int _y, int _width, int _height) {
		x = _x;
		y = _y;
		width = _width;
		height = _height;
		alpha = 255;
	}

	public void draw(Graphics2D g) {
		if(hover){
			g.setColor(setColourTransparency(backgroundHover,alpha));
		}else{
			g.setColor(setColourTransparency(backgroundIdle,alpha));
		}
		g.fillRect(x, y, width, height);

		g.setColor(setColourTransparency(borderIdle,alpha));
		g.drawRect(x, y, width, height);
		
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = parent.getLocation(this);
		boolean hasHover = (mx >= loc.x && mx <= loc.x + width && my >= loc.y && my <= loc.y + height);
		if(hover != hasHover){
			parent.repaint();
		}
		hover = hasHover;
	}


	@Override
	public void setAlpha(int a) {
		alpha = a;
		
	}

}
