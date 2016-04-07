/**
 * This represents a location.
 * @author grimauce
 */
public class Location
{
	public int location[][];
	
	public Location(int x, int y)
	{
		this.location [x][y] = Board.DEFAULT_EMPTY_CASE;
	}
}