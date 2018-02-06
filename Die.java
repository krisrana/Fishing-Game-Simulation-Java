/**
 * Author : Krishna Rana
 * Date   : 6/6/2017
 * Purpose: This is a die class, which represents a die with 6 sides.
 */
import java.util.Random;

/**
 * 
 * Die class
 * This program contains die, its sides.
 * It also contains the value stored every time a die is rolled.
 */
public class Die 
{
	//local declarations
	private int sides;
	private int value;
		
	/**
	 * Default constructor,which will call roll().
	 * @param side
	 */
	public Die(int side)
	{
		sides = 0;
		sides = side;
		roll();
	}
	
	/**
	 *	This method sets the value of the die to the random number
	 *  based on the sides provided by user. 
	 */
	public void roll()
	{
		Random randValue = new Random();
		value = randValue.nextInt(sides) + 1;
	}
	
	/**
	 * @return the value
	 */
	public int getValue() 
	{
		return value;
	}
}
