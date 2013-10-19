package graphics.TweenClass;

import java.awt.Point;
import graphics.GraphicsObject;

public class Tween {

    private TweenListener listener;
	public Point startPoint;
	public Point endPoint;
	public int startAlpha;
	public int endAlpha;
	
	public int divisor;
	public int currentStep;
	public GraphicsObject go;
	
	float stepX;
	float stepY;
	float stepAlpha;
	
	public Tween(Point _startPoint, Point _endPoint, int _startAlpha, int _endAlpha, int _divisor){
		startPoint = _startPoint;
		endPoint = _endPoint;
		divisor = _divisor;
		startAlpha = _startAlpha;
		endAlpha = _endAlpha;

		stepX = (endPoint.x - startPoint.x)/(float)divisor;
		stepY = (endPoint.y - startPoint.y)/(float)divisor;
		stepAlpha = (endAlpha - startAlpha)/(float)divisor;
	}
	public Point getNextPoint(){
		currentStep++;
		if(currentStep >= divisor){
			go.x = endPoint.x;
			go.y = endPoint.y;
			go.setAlpha(endAlpha);
			raiseTweenEvent();
			go.tweeningPosition = null;
			listener = null;
			return endPoint;
		}else
		return new Point(startPoint.x + (int)(currentStep * stepX), startPoint.y + (int)(currentStep * stepY));
	}
	public int getAlpha(){
		return startAlpha + (int)(stepAlpha * currentStep);
	}
	
    public void addTweenListener( TweenListener l ) {
        listener = l;
    }
    
    public void removeTweenListener( TweenListener l ) {
        listener = null;
    }
     
    private void raiseTweenEvent() {
    	if(listener != null)
    		listener.tweenCompleted( new TweenEvent(this) );
    }
}
