package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

class CollisionCheckListener implements ActionListener
{
	
	public void actionPerformed(ActionEvent e) 
	{
		for(int i = 0; i < Main.list.size(); i++)
		{
			if(Main.list.get(i).getStatic() == false)
			{
				if(Main.list.get(i).getX() < 47 || Main.list.get(i).getX() > 1198)
				{
					Utility.tableCollision(Main.list.get(i), true);
				}
				if(Main.list.get(i).getY() < 47 || Main.list.get(i).getX() > 598)
				{
					Utility.tableCollision(Main.list.get(i), false);
				}
				for(int a = 0; a < Main.list.size(); a++)
				{
					//check if the balls have collided
					if(Math.sqrt(Math.pow(Main.list.get(i).getX() + Main.list.get(a).getX(), 2) + Math.pow(Main.list.get(i).getY() + Main.list.get(a).getY(), 2)) <= 23)
					{
						Utility.ballCollision(Main.list.get(i), Main.list.get(a));
					}
				}
			}
		}
	}
	
}
