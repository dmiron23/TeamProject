package canvas;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

import graphics.BoxedText;
import graphics.GraphicsObject;
import graphics.Label;
import graphics.Rectangle;
import graphics.Line;

@SuppressWarnings("serial")
public class canvas extends JPanel implements MouseMotionListener{
	
	//Draw list, objects at the end appear in front of preceding objects.
	public static ArrayList<GraphicsObject> objects = new ArrayList<GraphicsObject>();

	//Below are wrapped constructors to:
	//	Create objects.
	//	Add them to drawing list at draw order 0 (Appears over older objects).
	//	Set the "parent" property to this.
	//	Return them for assignment purposes.
	public canvas(){
		addMouseMotionListener(this);
	}
	public Label createLabel(int _x, int _y, String _text) {
		Label l = new Label(_x, _y, _text);
		l.parent = this;
		objects.add(l);
		return l;
	}
	public Rectangle createRect(int _x, int _y, int _width, int _height) {
		Rectangle r = new Rectangle(_x, _y, _width, _height);
		r.parent = this;
		objects.add(r);
		return r;
	}
	public BoxedText createBoxedText(int _x, int _y, int _width, int _height, String _text) {
		BoxedText bT = new BoxedText(_x, _y, _width, _height, _text);
		bT.parent = this;
		objects.add(bT);
		return bT;
	}
	public Line createLine(int _x1, int _y1, int _x2, int _y2){
		Line l = new Line(_x1, _y1, _x2, _y2);
		l.parent = this;
		objects.add(l);
		return l;
	}
	
	@Override
	public void paintComponent(Graphics g){	

		//Routine to draw objects to screen.
		Graphics2D g2d = (Graphics2D) g;						//Cast Graphics to Graphics2D for convenience.
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);				//Enable antialiasing.
		Font f = new Font(Font.MONOSPACED, 0, 14);
		g.setFont(f);
		g2d.clearRect(0, 0, this.getWidth(), this.getHeight());	//Clear canvas.

		for(GraphicsObject go : canvas.objects){				//For each Graphics Object...

			g2d.setStroke(new BasicStroke(go.lineThickness));
			if(go.tweeningPosition != null){		
				go.setAlpha(go.tweeningPosition.getAlpha());			//If graphicsObject has a tween...
				Point newPos = go.tweeningPosition.getNextPoint();
				go.x = newPos.x;
				go.y = newPos.y;
			}
			go.draw(g2d);										//Draw the object.
			g2d.setStroke(new BasicStroke(1));					//Reset the line width.
			g2d.setColor(Color.BLACK);							//Reset the draw colour.
		}
	}
	public void removeObject(GraphicsObject go){				//Remove an object from the canvas.
		objects.remove(go);
	}
	public void removeAll(){									//Remove all objects from the canvas.
		objects = new ArrayList<GraphicsObject>();
	}
	
	//Listeners for:
	//	Mouse movement, for whatever interactivity we wish to implement.
	//	Mouse dragging, requirement of interface.
	//	FPS ticker, listed as "actionPerformed", proceeds animation at 60fps.
	
	@Override
	public void mouseMoved(MouseEvent e){						//Whenever the mouse is moved...
		for(GraphicsObject go : canvas.objects){				//For each GraphicsObject...
			go.handleMouse(e.getXOnScreen(), e.getYOnScreen());	//Pass the coordinates to the object.
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {}					//Required for MouseMotionListener.
	public void updateCanvas(){
		revalidate();
		repaint();
	}
	
	public Point getLocation(GraphicsObject go){				//Used to provide the absolute position of a child.
		Point p = getLocationOnScreen();						//Get the absolute position of this.
		p.translate(go.x, go.y);								//Offset it by the child position.
		return p;												//Return the position.
	}
	public void destroy(){										//Kill the timer.
		removeMouseMotionListener(this);						//Remove the mouse movement listener.
	}

}
