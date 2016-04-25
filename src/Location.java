/**
 * This represents a location.
 * @author grimauce
 */
public class Location
{
	/**
	 * x represents the x-axis for a location
	 */
	private final int x;
	/**
	 * x represents the y-axis for a location
	 */
	private final int y;
	
	/**
	 * Location constructor
	 * @param abs
	 * @param ord
	 */
	  public Location(int abs, int ord)
	 
	{
		this.x = abs;
		this.y = ord;
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