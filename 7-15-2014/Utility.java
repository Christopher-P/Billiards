package simulation;

public class Utility {
	
	public static void ballCollision(Ball ballOne, Ball ballTwo)
	{
		
	}
	
	public static void tableCollision(Ball ballOne, boolean xCollision)
	{
		if(xCollision)
		{
			ballOne.setVectorX(ballOne.getVectorX() * -1);
		}
		else
		{
			ballOne.setVectorY(ballOne.getVectorY() * -1);
		}
	}

}
//hi