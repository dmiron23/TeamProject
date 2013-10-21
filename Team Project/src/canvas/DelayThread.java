package canvas;
public class DelayThread extends Thread {
	private int delay = 100;
	private int stateFlag;
	private AnimationControl ac;
	public DelayThread(int _delay, AnimationControl _ac, int _stateFlag){
		delay = _delay;
		ac = _ac;
		stateFlag = _stateFlag;
	}
	public void run(){
		try {
			sleep(delay);
			ac.stateFlag = stateFlag;
		} catch (InterruptedException e) {
		}
	}
}
