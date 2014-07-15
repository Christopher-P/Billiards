package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
public class MoveDrawListener implements ActionListener{

	private Ball tempBall = new Ball();
	public void actionPerformed(ActionEvent e) 
	{
		for(int i = 0; i < Main.list.size(); i++)
		{
			//Main.list.get(i)
			tempBall = Main.list.get(i);
			
			if(tempBall.getStatic() == false)
			{
				if((tempBall.getVectorX() / Math.abs(tempBall.getVectorX())) * Math.abs(tempBall.getVectorX() - Ball.FRICTION) == 0)
				{
					if((tempBall.getVectorY() / Math.abs(tempBall.getVectorY())) * Math.abs(tempBall.getVectorY() - Ball.FRICTION) == 0)
					{
						
					}
				}
				else
				{
					tempBall.setX((int) Math.round(tempBall.getX() + tempBall.getVectorX()));
					tempBall.setY((int) Math.round(tempBall.getY() + tempBall.getVectorY()));
					tempBall.setVectorX((tempBall.getVectorX() / Math.abs(tempBall.getVectorX())) * (Math.abs(tempBall.getVectorX()) - (tempBall.getVectorX() / tempBall.getMagnitude())) * Ball.FRICTION);
					tempBall.setVectorY((tempBall.getVectorY() / Math.abs(tempBall.getVectorY())) * (Math.abs(tempBall.getVectorY()) - (tempBall.getVectorY() / tempBall.getMagnitude())) * Ball.FRICTION);
					System.out.println("The vectorX is :" + tempBall.getVectorX());
					System.out.println("The vectorY is :" + tempBall.getVectorY());
				}
			}
			Main.list.set(i, tempBall);
		}
		Main.repaintField();
	}

}
