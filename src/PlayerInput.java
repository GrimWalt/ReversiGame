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
	private boolean currentPlayer;
	
	/**
	 * Setter for currentPlayer
	 * @param currentPlayer
	 */
	public void setCurrentPlayer(boolean currentPlayer)
	{
		this.currentPlayer = currentPlayer;
	}

	/**
	 * getter  for currentPlayer
	 * @return currentPlayer
	 */
	public boolean getCurrentPlayer()
	{
		return this.currentPlayer;
	}

	/**
	* PlayerInput's constructor
 	*/
	public PlayerInput()
	{
		this.currentPlayer = false; 
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