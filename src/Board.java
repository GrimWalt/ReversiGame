/**
 * This represents a game board.
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
	private int board[][];
	
	
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
		
		// TODO add the other condition...   NEXT THING TO DO !!!!
		/**
		 * 
		 * @param loc
		 * @return
		 * true = valid location
		 * false = wrong location
		 */
		public boolean isPawnLocationValid(Location loc)
		{
			if (this.board[loc.getX()][loc.getY()] != Board.DEFAULT_EMPTY_CASE)
				return false;
			//...here !
			return true;
		}
	
	
	/**
	 * This method is called when a player ends his turn. It will decide which pawns are wololo and transform them.
	 * @param loc
	 * Define the valid location of the new pawn. This method will add the pawn to the board.
	 */
	public static void updateBoard(Location loc)
	{
		
	}
	

		
	
}
