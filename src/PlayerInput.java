/**
 * This represents a player.
 * 
 * @author grimauce
 */
public class PlayerInput
{

	private boolean isCurrentPlayer;
	
	/**
	 * getter  for isCurrentPlayer
	 * @return
	 */
	public boolean isCurrentPlayer()
	{
		return isCurrentPlayer;
	}

	/**
	* PlayerInput's constructor
 	*/
	public PlayerInput()
	{
		
	}
	
	/**
	 * Ask player for pawn location
	 * @return Returns the location given by the player. 
	 */
	public Location askLocation()
	{
		//ask x;
		//ask y;
		Location location = new Location(0,0);
		return location;		
	}
	

	
	
	
}