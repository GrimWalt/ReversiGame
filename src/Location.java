/**
 * This represents a location.
 * consider that only valid, locations can be created (i.e. inside board)
 * @author grimauce
 */
public class Location

{

	/**
	 * x represents the x-axis for a location
	 */
	private int x;
	
	/**
	 * x represents the y-axis for a location
	 */
	private int y;
	
	/**
	 * Location constructor
	 * @param abs
	 * @param ord
	 */
	public Location(int abs, int ord)
	 
	{
	
		try
		{
			this.x = abs;
			this.y = ord;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds");
		}
		
	}

	/**
	 * This method is used for catch the first parameter of a location.
	 * @return
	 * the first parameter
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * This method is used for catch the second parameter of a location.
	 * @return
	 * the second parameter
	 */
	public int getY()
	{
		return this.y;
	}
	  
	
}