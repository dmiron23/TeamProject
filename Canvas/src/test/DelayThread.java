package test;

public class DelayThread extends Thread {
	private int delay = 100;
	private AnimationControl ac;
	public DelayThread(int _delay, AnimationControl _ac){
		delay = _delay;
		ac = _ac;
	}
	public void run(){
		try {
			sleep(delay);
			ac.stateFlag = 2;
		} catch (InterruptedException e) {
		}
	}
}
