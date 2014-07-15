package simulation;

import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame{
	
	private myPanel pane = new myPanel();
	
	public GUI()
	{
		// Set the title.
	    setTitle("Test");

	    // Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Set Layout
	    setLayout(new BorderLayout());
	    
	    add(pane);
	    //Sets the size (duh)
	    setSize(700,350);
	    
	    //sets the jframe visible
	    setVisible(true);
	    
	    pane.setVisible(true);
	    
	    invalidate();
	}
	
	public void paint()
	{
		pane.invalidate();
	}
	
	public class myPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponents(g);
			g.setColor(Color.BLACK);
			paintTable(g);
			paintBalls(g);
		}
		
		public void paintTable(Graphics g)
		{
			g.drawRect(35, 35, Table.insideWidth, Table.insideHeight);
			g.drawRect(10, 10, Table.borderWidth, Table.borderHeight);
		}
		
		public void paintBalls(Graphics g)
		{
			for(int i = 0; i < Main.list.size(); i++)
			{
				g.drawOval(Main.list.get(i).getX(), Main.list.get(i).getY(), Ball.RADIUS, Ball.RADIUS);
			}
		}
	}

}
