package DAY22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet3 extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//by clicking the warning...
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(b1))
		{
			t.setText("hello");
		}
		if(e.target.equals(b2))
			t.setText(" ");
		
		return true;
	}
}