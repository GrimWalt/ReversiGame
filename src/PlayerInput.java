import java.util.Random;
/**
 * This represents a player.
 * 
 * @author grimauce
 */
public class PlayerInput
{
	
	/**
	 * 
	 */
	boolean currentPlayerState;
	
	/**
	 * Setter for currentPlayer
	 * @param currentPlayer
	 */
	public void setCurrentPlayer(boolean currentPlayer)
	{
		this.currentPlayerState = currentPlayer;
	}

	/**
	 * getter  for currentPlayer
	 * @return currentPlayer
	 */
	public boolean getCurrentPlayerState()
	{
		return this.currentPlayerState;
	}

	/**
	* PlayerInput's constructor
 	*/
	public PlayerInput()
	{
		this.currentPlayerState = false; 
	}
	
	/**
	 * Ask player for pawn location
	 * @return Returns the location given by the player. 
	 */
	public Location askLocation()
	
	{
		Random rannomnom = new Random();
		boolean boobool = rannomnom.nextBoolean();
		
		if( boobool) return null;
		else
		{
		
		Random rand = new Random();
		int x = rand.nextInt(8); // between 0 et 7

		Random rando = new Random();
		int y = rando.nextInt(8); // between 0 et 7

		Location location = new Location(x,y);
		return location;		
	
		}
	}
		

}