package canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import graphics.BoxedText;
import graphics.GraphicsObject;
import graphics.Line;
import graphics.TweenClass.Tween;
import graphics.TweenClass.TweenEvent;
import graphics.TweenClass.TweenListener;

public class AnimationControl implements ActionListener, TweenListener {
	private canvas c;
	private Timer t = new Timer(1000/60, this);	
	public int stateFlag = 0;
	private Object returnObj;
	
	public AnimationControl(canvas _c){
		c = _c;
	}
	public void actionPerformed(ActionEvent e) {				//Timer action, 60 times per second.
	    tick();													//Tick the animation.
	}
	
	public  void tick(){
		if(stateFlag == 0){

			c.createBoxedText(30, 30, 70, 30, "DOG");
			Line line = c.createLine(20, 20, 200, 200);
			line.lineThickness = 3;
			line.setAlpha(64);
			BoxedText bT = c.createBoxedText(60, 35, 70, 30, "CAT");
			bT.setAlpha(128);
			bT = c.createBoxedText(90, 40, 70, 30, "COW");
			bT.getRect().backgroundIdle = new Color(190,190,190);
			bT.setAlpha(128);
			bT = c.createBoxedText(30, 50, 70, 30, "PIG");
			bT.getRect().backgroundIdle = new Color(192,112,205);
			bT.setAlpha(64);
			bT.lineThickness = 2;
			
			//WAIT FOR TWEEN, without object ref we don't have a reliable way to
			//differ between related objects, best use some global var.
			Tween t = bT.tweenTo(200, 200, 0, 255, 150);

			t.addTweenListener(this);
			stateFlag = -1;
			
		}else if(stateFlag == 1){
			stateFlag = -1;
			
			//Wait for arbitrary length of time.
			
			Thread th = new DelayThread(3000,this);
			th.start();
		}else if(stateFlag == 2){

			c.removeObject((GraphicsObject)returnObj);
			BoxedText bT = c.createBoxedText(160, 35, 70, 30, "BEE");
			bT.getRect().backgroundIdle = new Color(255,255,30);
			bT.setAlpha(128);
			stateFlag = 2;
		}
		c.updateCanvas();
	}
	
	public void startAnimation(){
		t.start();
	}
	@Override
	public void tweenCompleted(TweenEvent event) {
		Tween t = (Tween)event.getSource();
		t.removeTweenListener(this);
		returnObj = t.go;
		stateFlag = 1;		
	}
}
