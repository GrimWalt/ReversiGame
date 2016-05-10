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
	private PlayerInput blackPlayer;
   

	/**
	 * This represents the white player
	 */
	private PlayerInput whitePlayer;




	

	

	/**
	 * Creates a new Reversi game, ready to begin (board in starting configuration, 2 players)
	 * 
	 */
	public ReversiGame()
	{
		this.board = new Board();
		this.blackPlayer = new PlayerInput();
		this.whitePlayer = new PlayerInput();		
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
		PlayerInput currentPlayer = this.blackPlayer;
		
		while(!this.isGameOver())
		{
			if (Board.isPlayerAble(currentPlayer))
			
			{
				Location location = null;
			
				do
				{
					location = currentPlayer.askLocation();
				}
				while(!this.board.isPawnLocationValid(location));
	
				this.board.updateBoard(location);
			}
			
			switchPlayer(currentPlayer);
		}
	}




	
	/**
	 * Return true when the game is over (false when it continues) :
	 * The game is over when the board is full or when a player hasn't pawns anymore on the board.
	 * @return true : Game Over
	 * false : the game continues
	 */
	private boolean isGameOver()
	{
		

		
		
		int i = 0;
		int j = 0;
		while(this.board[i][j] != Board.BLACK_PAWN)
			
		{
			for(i = 0; i < Board.MAX_DIMENSION; i++)
			{
				for(j = 0; j < Board.MAX_DIMENSION; j++)
				{

				}
			}
			
			return true;
		
		}
	
		i = 0;
		j = 0;
		while(this.location[i][j] != Board.WHITE_PAWN)
		
		{
			for(i = 0; i < Board.MAX_DIMENSION; i++)
			{
				for(j = 0; j < Board.MAX_DIMENSION; j++)
				{
				
				}
			}
			return true;
			
		}
		
		i = 0;
		j = 0;
		
		for(i = 0; i < Board.MAX_DIMENSION; i++)
		{
			for(j = 0; j < Board.MAX_DIMENSION; j++)
			{
				if(this.board.location[i][j] == Board.EMPTY)
					return false;
			}
		}
		
		return true;
	}
	
	/**
	 * This method is used to end the turn of a player, and to allow the other player to play. 
	 * @param player
	 */
	public void switchPlayer(PlayerInput player)
	{
		
	}
}