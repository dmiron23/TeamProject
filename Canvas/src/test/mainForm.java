package test;

import java.awt.HeadlessException;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class mainForm extends JFrame {
	public mainForm(String title) throws HeadlessException {
		super(title);												//Set form title.
		this.setBounds(200, 200, 550, 400);							//Set form position and size.
		this.setVisible(true);										//Show form.
		
		final canvas c = new canvas();								//Create new drawing surface.
		c.setupListeners();											//Set up event listeners.
		
		AnimationControl ac = new AnimationControl(c);
		ac.startAnimation();
		this.add(c);												//Add the surface to the form.
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {	//Listen for exit.
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	c.destroy();										//Call destroy function on exit.
		    	System.exit(0);										//Actually exit (force quit).
		    }
		});
	}

}
