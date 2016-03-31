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
		this.player1 = new Player();
		this.player2 = new Player();		
	}

	

	
	/**
	 * 
	 * This method plays the game.
	 *
	 *
	 *	current player is player 1
	 * 	While <game is not over>:
	 * 		while (<new pawn location not valid>)
	 * 			<ask current player for a new pawn location>
	 *     <put the pawn>
	 *     <compute the new state of the board>
	 *     <evaluate if game is over>
	 *     current player changes
	 *
	 */
	public void play()
	{
		Player currentPlayer;
		while(!this.isGameOver())
		{
			
			while(!this.isPawnLocationValid())
			{
				Player.askLocation(currentPlayer);
				
			}
			Board.updateBoard();
			Board.isGameOver(board);
			Player.switchPlayer();
		    }
}



	private boolean isPawnLocationValid()
	{
		if(machin != Player.DEFAULT_EMPTY_CASE)
			return false;
		return true;
	}


	
	/**
	 * Return true when the game is over (false when it continues) :
	 * The game is over when the board is full or when a player hasn't pawns anymore on the board.
	 * @param b
	 * @return
	 */
	private boolean isGameOver(Board b)
	{
		

		
		
		int i = 0;
		int j = 0;
		while(b[i][j] != Board.DEFAULT_BLACK_PAWN)
			
		{
			for(i = 0; i <= 7; i++)
			{
				for(int j = 0; j <= 7; j++)
				{

				}
			}
			
			return true;
		
			}
		}
	
		
	
	
		i = 0;
		j = 0;
		while(b[i][j] != Board.DEFAULT_WHITE_PAWN)
		
		{
			for(i = 0; i <= 7; i++)
			{
				for(int j = 0; j <= 7; j++)
				{
				
				}
			}
			return true;
			
		}
		
		return false;
		
		
		
		
		/*  We will use this for equality
		 
		for(int i = 0; i <= 7; i++)
		{
			for(int j = 0; j <= 7; j++)
			{
				if(b[i][j] == Board.DEFAULT_EMPTY_CASE)
					return false;
			}
		}
		
		*/
	}
