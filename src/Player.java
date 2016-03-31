// TODO fix comment (ask for advice)
/**
 * Player class with his constructor.
 * This represents a player.
 * 
 * @author grimauce
 */
public class Player
{
		/**
		 * Give a color to the player's pawns
		 * 0 --> white
		 * 1 --> black
		 */
		private boolean color;
		
		
		
		/**
		 * Creates a new player, in starting configuration, ready to play
		 */	
		public Player()
		{
			
			this.player = DEFAULT_PLAYER;
			
		}
		
		
		
		/**
		 * Change the player
		 */
	public switchPlayer()
		{
			this.color = !this.color;
		}

	
}
