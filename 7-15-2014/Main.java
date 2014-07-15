package simulation;

import java.util.ArrayList;
import javax.swing.Timer;

public class Main 
{
	public static ArrayList<Ball> list = new ArrayList<Ball>();
	private static Timer CollisionTimer = new Timer(10, new CollisionCheckListener());
	private static Timer MoveDrawTimer = new Timer(10, new MoveDrawListener());
	private static GUI gui = new GUI();
	
	private static Ball cue = new Ball(100,100);
	
	public static void main(String[] args) 
	{
		
		cue.setStatic(false);
		cue.setVectorX(10);
		cue.setVectorY(10);
		list.add(cue);
		CollisionTimer.start();
		MoveDrawTimer.start();
	}
	
	public static void repaintField()
	{
		gui.repaint();
	}
	
	
}
