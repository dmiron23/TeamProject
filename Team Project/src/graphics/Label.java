package graphics;
import java.awt.Graphics2D;

public class Label extends GraphicsObject {
	public String text;
	
	public Label(int _x, int _y, String _text) {
		x = _x;
		y = _y;
		text = _text;
		alpha = 255;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(setColourTransparency(foregroundIdle,alpha));

		g.drawString(text, x  , y+ g.getFontMetrics().getHeight());
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
