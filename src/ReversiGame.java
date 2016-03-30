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
	// TODO clean comment (ask for advice) (done)
	/**
	 *  This represents the board in his default configuration.
	 */
	private Board board;
	
	// TODO clean comment (ask for advice)   (done)
	/**
	 * Create the player "Player1".
	 */
	private Player player1;
   
	// TODO clean comment (ask for advice)  (done)
	/**
	 * Create the player "Player2"
	 */
	private Player player2;

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
				askLocation(currentPlayer);
				
			}
			Board.updateBoard(board, askLocation(currentPlayer));
			Board.isGameOver(board);
			Player.switchPlayer();
		    }
}



	private boolean isPawnLocationValid()
	{
		
		return false;
	}



	private boolean isGameOver()
	{
		
		return false;
	}
