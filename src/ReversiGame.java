/**
 *
 * This class represents a Reversi game.
 * 
 * https://fr.wikipedia.org/wiki/Othello_%28jeu%29
 * 
 * @author grimauce
 */
public class ReversiGame
{
	/**
	 *  This represents the board.
	 */
	private Board board;
	
	
	/**
	 * This represents the black player.
	 */
	private Player blackPlayer;
   

	/**
	 * This represents the white player
	 */
	private Player whitePlayer;

	/**
	 * Creates a new Reversi game, ready to begin (board in starting configuration, 2 players)
	 * 
	 */
	public ReversiGame()
	{
		this.board = new Board();
		this.blackPlayer = new Player();
		this.whitePlayer = new Player();		
	}

	

	
	/**
	 * 
	 * This method plays the game.
	 *
	 *
	 *	current player is black player
	 * 	While <game is not over>:
	 * 		do 
	 * 			<ask current player for a new pawn location>
	 *     while (<new pawn location not valid>)
	 *     <put the pawn>
	 *     <compute the new state of the board>
	 *     <evaluate if game is over>
	 *     <current player changes>
	 *
	 */
	public void play()
	{
		Player currentPlayer = this.blackPlayer;
		
		while(!this.isGameOver())
		{
			Location location = null;
			
			do
			{
				location = currentPlayer.askLocation();
			}
			while(!this.board.isPawnLocationValid(location));
	
			this.board.updateBoard(location);
			this.isGameOver();
			Player.switchPlayer();
		    }
}




	
	/**
	 * Return true when the game is over (false when it continues) :
	 * The game is over when the board is full or when a player hasn't pawns anymore on the board.
	 * @param b
	 * @return
	 */
	private boolean isGameOver()
	{
		

		
		
		int i = 0;
		int j = 0;
		while(this.location[i][j] != Board.DEFAULT_BLACK_PAWN)
			
		{
			for(i = 0; i <= 7; i++)
			{
				for(j = 0; j <= 7; j++)
				{

				}
			}
			
			return true;
		
		}
	
		i = 0;
		j = 0;
		while(this.location[i][j] != Board.DEFAULT_WHITE_PAWN)
		
		{
			for(i = 0; i <= 7; i++)
			{
				for(j = 0; j <= 7; j++)
				{
				
				}
			}
			return true;
			
		}
		
		i = 0;
		j = 0;
		
		for(i = 0; i <= 7; i++)
		{
			for(j = 0; j <= 7; j++)
			{
				if(this.location[i][j] == Board.DEFAULT_EMPTY_CASE)
					return false;
			}
		}
		
		return true;
	
	}
}