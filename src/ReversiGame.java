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
	 *  Board object
	 */
	private Board board;
	
	// TODO write comment
	/**
	 * Create the player "Player1".
	 * This is the white player.
	 */
	private Player player1;

	// TODO write comment
	/**
	 * Create the player "Player2";
	 * This is the black player.
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

	

	// TODO detail algorithm (ask for advice)
	/**
	 * 
	 * This method plays the game.
	 *
	 *
	 *	current player is player 1
	 * 	While <game is not over>:
	 * 		while (<new pawn location not valid>)
	 * 			<ask current player for a new pawn location>
	 *     <compute the new state of the board>
	 *     <evaluate if game is over>
	 *     current player changes
	 * 					 	 
	 *
	 */
	public void play()
	{
		// TODO Auto-generated method stub
		Player currentplayer;
		while(isGameOver() = false)
		{
			 
			while(isPawnLocationValid() = false)
			{
				askLocation(currentPlayer);
				
			}
			Board.updateBoard(board, askLocation(currentPlayer));
			Board.isGameOver(board);
			Player.switchPlayer();
		    }
}
