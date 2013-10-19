package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import canvas.canvas;
import graphics.TweenClass.Tween;

public abstract class GraphicsObject {
	//Some basic properties that will apply to all graphics objects.
	public int x;
	public int y;
	public int width;
	public int height;
	public int alpha;		//Opacity, 0-255
	public int lineThickness = 1;
	public boolean hover;
	public canvas parent;
	public Tween tweeningPosition;
	
	
	
	//All objects need to call draw to actually be shown.
	public abstract void draw(Graphics2D g);
	public abstract void handleMouse(int mx, int my);
	public abstract void setAlpha(int a);
	
	public Tween tweenTo(int _x, int _y, int _sa, int _ea, int divisor){
		tweeningPosition = new Tween(new Point(x,y), new Point(_x,_y), _sa, _ea, divisor);
		tweeningPosition.go = this;
		return tweeningPosition;
	}
	public void swapDepth(GraphicsObject other){
		int i = canvas.objects.indexOf(this);
		int oi = canvas.objects.indexOf(other);
		canvas.objects.set(oi, this);
		canvas.objects.set(i, other);
	}
	public void bringToFront(){
		canvas.objects.remove(this);
		canvas.objects.add(this);
	}
	public void sendToBack(){
		canvas.objects.remove(this);
		canvas.objects.add(0,this);
	}
	protected Color setColourTransparency(Color _c, int alpha){
		return new Color(_c.getRed(), _c.getGreen(), _c.getBlue(), alpha);
	}
	
	public Color backgroundIdle = new Color(169,232,238);
	public Color backgroundHover = new Color(213,242,245);
	public Color backgroundActive = new Color(144,203,209);
	
	public Color borderIdle = new Color(0,0,0);
	public Color borderHover = new Color(0,0,0);
	public Color borderActive = new Color(0,0,0);
	
	public Color foregroundIdle =  new Color(0,0,0);
	public Color foregroundHover = new Color(255,255,255);
	public Color foregroundActive = new Color(0,0,0);
}
