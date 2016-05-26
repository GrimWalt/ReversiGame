import java.util.Arrays;
import java.util.Random;

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
	public static final int MAX_DIMENSION = 8;
	
	/**
	 * Define the border of the board.
	 */
	public static final int MIN_DIMENSION = 0;

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
	 * 
	 * @return the number of columns and rows.
	 */
	public static int getMaxDimension()
	{
		return MAX_DIMENSION;
	}

	// TODO finish writing comment
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
		int pawnCounter = 0;
		int x = loc.getX();
		int y = loc.getY();
		
		
		//for the white player
		if(getWhitePlayer().getCurrentPlayerState() == true )
		{
			
			pawnCounter = 0;
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				x--;
				if(this.board[x][y] == EMPTY)
					break;
				else if(x<MIN_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					x++;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the x axis (forward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				x++;
				if(this.board[x][y] == EMPTY)
					break;
				else if(x>MAX_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					x--;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the y axis (forward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y++;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y>MAX_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y--;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the y axis (backward)
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y--;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y<MIN_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y++;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the x=y axis (backward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y--;
				x--;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y<MIN_DIMENSION || x<MIN_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y++;
					x++;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the x=y axis (forward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y++;
				x++;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y>MAX_DIMENSION || x>MAX_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y--;
					x--;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the -x=y axis (backward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y++;
				x--;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y>MAX_DIMENSION || x<MIN_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y--;
					x++;
					this.board[x][y] = WHITE_PAWN;
				}
			}
			
			// roadtrip of the -x=y axis (forward)
			
			x = loc.getX();
			y = loc.getY();
			pawnCounter = 0;
			
			while (this.board[x][y] != WHITE_PAWN)
			{
				
				y--;
				x++;
				if(this.board[x][y] == EMPTY)
					break;
				else if(y<MIN_DIMENSION || x>MAX_DIMENSION)
					break;
				else
				pawnCounter++;
			}
			if(pawnCounter < 0)
			{
				for(int i = 0; i<=pawnCounter;i++)
				{
					y++;
					x--;
					this.board[x][y] = WHITE_PAWN;
				}
			
			}			
			
		}
		
		//for the black player
				if(getBlackPlayer().getCurrentPlayerState() == true )
				{
					
					pawnCounter = 0;
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						x--;
						if(this.board[x][y] == EMPTY)
							break;
						else if(x<MIN_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							x++;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the x axis (forward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] !=BLACK_PAWN)
					{
						
						x++;
						if(this.board[x][y] == EMPTY)
							break;
						else if(x>MAX_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							x--;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the y axis (forward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y++;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y>MAX_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y--;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the y axis (backward)
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y--;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y<MIN_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y++;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the x=y axis (backward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y--;
						x--;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y<MIN_DIMENSION || x<MIN_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y++;
							x++;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the x=y axis (forward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y++;
						x++;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y>MAX_DIMENSION || x>MAX_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y--;
							x--;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the -x=y axis (backward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y++;
						x--;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y>MAX_DIMENSION || x<MIN_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y--;
							x++;
							this.board[x][y] = BLACK_PAWN;
						}
					}
					
					// roadtrip of the -x=y axis (forward)
					
					x = loc.getX();
					y = loc.getY();
					pawnCounter = 0;
					
					while (this.board[x][y] != BLACK_PAWN)
					{
						
						y--;
						x++;
						if(this.board[x][y] == EMPTY)
							break;
						else if(y<MIN_DIMENSION || x>MAX_DIMENSION)
							break;
						else
						pawnCounter++;
					}
					if(pawnCounter < 0)
					{
						for(int i = 0; i<=pawnCounter;i++)
						{
							y++;
							x--;
							this.board[x][y] = BLACK_PAWN;
						}
					
					}			
					
				}
	}

	/**
	 * This method is used for print the board on the screen.
	 * 
	 * @param board
	 * The board which the game is played.
	 */

	@Override
	public String toString()
	{
		return "Board [board=" + Arrays.toString(board) + "]";
	}
	

}
