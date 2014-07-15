package simulation;

import java.lang.Math;

public class Ball {
	
	public static final double FRICTION = 1;
	public static final int RADIUS = 23;
	private boolean statik;
	private double vectorX;
	private double vectorY;
	private int X;
	private int Y;
	
	public Ball()
	{
		this(0,0);
	}
	
	public Ball(int xLocation, int yLocation)
	{
		statik = true;
		X = xLocation;
		Y = yLocation;
	}
	
	public int getX()
	{
		return X;
	}
	
	public int getY()
	{
		return Y;
	}
	
	public double getVectorX()
	{
		return vectorX;
	}
	
	public double getVectorY()
	{
		return vectorY;
	}
	
	public boolean getStatic()
	{
		return statik;
	}
	
	public double getMagnitude()
	{
		return Math.sqrt((vectorX * vectorX) + (vectorY * vectorY));
	}
	
	public void setX(int xLocation)
	{
		X = xLocation;
	}
	
	public void setY(int yLocation)
	{
		Y = yLocation;
	}
	
	public void setVectorX(double vectX)
	{
		vectorX = vectX;
	}
	
	public void setVectorY(double vectY)
	{
		vectorY = vectY;
	}
	
	public void setStatic(boolean state)
	{
		statik = state;
	}
}
