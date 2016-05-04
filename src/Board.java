import java.util.Arrays;

/**
 * This represents a game board. The board has 64 cells. (8*8)
 * 
 * @author grimauce
 *
 */
public class Board
{
	/**
	 * Define the number of columns and rows of the board.
	 */
	private static final int MAX_DIMENSION = 8;

	

	/**
	 * This constant define the state of each cell owned by the white player.
	 */
	public static final int WHITE_PAWN = 1;

	/**
	 * This constant define the state of each cell owned by the black player.
	 */
	public static final int BLACK_PAWN = 2;

	/**
	 * This constant define the state of each cell empty of any pawns.
	 */
	public static final int EMPTY = 0;

	/**
	 * This is a board of integers which will be completed only with the
	 * constants defined previously.
	 * 
	 */
	private int board[][];

	/**
	 * Creates a new board, in starting configuration
	 */
	public Board()
	{
	
		for (int rowIndex = 0; rowIndex < MAX_DIMENSION; rowIndex++)
			for (int columnIndex = 0; columnIndex < MAX_DIMENSION; columnIndex++)
				this.board[rowIndex][columnIndex] = EMPTY;
		
		this.board[3][3] = BLACK_PAWN;
		this.board[3][4] = WHITE_PAWN;
		this.board[4][3] = WHITE_PAWN;
		this.board[4][4] = BLACK_PAWN;

	}
	
	/**
	 * getter for MAX_DIMENSION
	 * @return the number of columns and rows.
	 */
	public static int getMaxDimension()
	{
		return MAX_DIMENSION;
	}
	
	// TODO add the other condition
	/**
	 * 
	 * @param loc
	 * @return true = valid location false = wrong location
	 */
	public boolean isPawnLocationValid(Location loc)
	{
		try
		{
			if (this.board[loc.getX()][loc.getY()] != Board.EMPTY)
				return false;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			return false;
		}

		return true;
	}

	/**
	 * This method is called when a player ends his turn. It will decide which
	 * pawns are wololo and transform them.
	 * 
	 * @param loc
	 *            Define the valid location of the new pawn. This method will
	 *            add the pawn to the board.
	 */
	public void updateBoard(Location loc)
	{

	}

	//TODO code this method
		/**
		 * This method is used for print the board on the screen.
		 * @param board The board which the game is played.
		 */

	@Override
	public String toString()
	{
		return "Board [board=" + Arrays.toString(board) + "]";
	}
	
}
