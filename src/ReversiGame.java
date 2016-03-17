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
	private Player player1;

	// TODO write comment
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

	

	// TODO detail algortihm (ask for advice)
	/**
	 * 
	 * This method plays the game. 
	 * 
	 * While the board isn't full and both players still have tokens :
	 * 		One player Play HIS turn :
	 * 			While the player haven't put a token:
	 * 				If a cell is adjacent to an opponent's token and this cell is empty :
	 * 					 	 The player can put a token on it
	 * 				If one or more token(s) is(are) between 2 enemies tokens, this(those) token(s) is(are) wololo.  
	 *  
	 *
	 */
	public void play()
	{
		// TODO Auto-generated method stub

	}
}
