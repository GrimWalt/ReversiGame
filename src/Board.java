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
	public static final int DEFAULT_WHITE_PAWN = 1;
	
	
	/**
	 *  This constant define the state of each cell owned by the black player.
	 */
	public static final int DEFAULT_BLACK_PAWN = 2;
	
	
	/**
	 *  This constant define the state of each cell empty of any pawns.
	 */
	public static final int DEFAULT_EMPTY_CASE = 0;
	
	
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
		
		int i;
		int j;
		
		for(i=0; i > 8; i++) 
		{
			for(j=0; j > 8; j++)
			{
				this.board[i][j] = DEFAULT_EMPTY_CASE;
			}
			
		}
		
		
		this.board[3][3] = DEFAULT_BLACK_PAWN;
		this.board[3][4] = DEFAULT_WHITE_PAWN;
		this.board[4][3] = DEFAULT_WHITE_PAWN;
		this.board[4][4] = DEFAULT_BLACK_PAWN;
		
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


	
	/**
	 * Ask to the player to choose a cell to put his pawn.
	 * @param i
	 * @param j
	 * @param player
	 * @throws CellIsFullException
	 */
	public static  askLocation(int i, int j, Player player) throws CellIsFullException
	{
		try
		{
			this.board[][]
		}
	}
	
		
	
}
