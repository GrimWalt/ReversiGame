// TODO fix comment (ask for advice)
/**
 * Game board.
 * The board has 64 cells. (8*8)
 * @author grimauce
 *
 */
public class Board	
{	
	/**
	 *  This constant define the state of each cell owned by the white player.
	 */
	private static final int DEFAULT_WHITE_PAWN = 1;
	/**
	 *  This constant define the state of each cell owned by the black player.
	 */
	private static final int DEFAULT_BLACK_PAWN = 2;
	/**
	 *  This constant define the state of each cell empty of any pawns.
	 */
	private static final int DEFAULT_EMPTY_CASE = 0;
	
	/**
	 * This is a board of integers which will be completed only with the constants defined previously.
	 * 
	 */
	private int[][] board;
	
	/**		
	 *	 Creates a new board, in starting configuration
	 */
		public Board()
	{
		private int i = 0;
		private int j = 0;
		
		// TODO create the second while

		while i != 8 
				{
					board[i][j] = DEFAULT_EMPTY_CASE;
					i++;
				}
		
		
	}

	
	/**
	 * This method is called when a player ends his turn. It will decide which pawns are wololo and transform them.
	 * 
	 */
	public static void updateBoard()
	{
		
		
		 
	}
	
	/**
	 * This method check if the board have always empty cases and if it remains pawns of the 2 players .
	 * False  : the game continues
	 * True : End of the game	 * 
	 * @grimauce
	 */
	public static boolean isGameOver()
	{
		
		
		
	}
	
		
}
