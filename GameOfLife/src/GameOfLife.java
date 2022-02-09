
public class GameOfLife {

	private int[][] grid;
	
	public GameOfLife() {
	}

	public GameOfLife(int length, int width) {
		
		this.grid = new int[length][width];
	}
	
	
	public void setGrid(int[][] resultantGrid) {

		this.grid = resultantGrid;
	}
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int[][] getGrid() {
		// Returns my encapsulated grid array
		return this.grid;
	}
	
	public void nextIteration() {
		// Determine the next state of every cell on the grid by first 
		//  calculating the number of dead and live cells neighboring one cell 
		//  and then applying the rules above to determine the state of that cell.
		
		// Temporary grid being evaluated with by the 4 rules
		int[][] tempGrid = getGrid();
		// Resultant grid that holds the changed/updated cells
		int[][] resultantGrid = new int[getGrid().length][getGrid()[0].length];
		// Initialize positions relative to current cell
		int center,NW,N,NE,E,SE,S,SW,W;
		
		// Touch/traverse every cell of the inner grid (does not touch edges)
		//  ex.) 4x4 grid yields the inner 2x2 grid
		for (int row = 1; row < tempGrid.length - 1; row++) {
			for (int col = 1; col < tempGrid[0].length  - 1; col++) {
				
				// Set the values of each position relative
				//  to the row and col of the current cell
				center = tempGrid[row][col];
				NW = tempGrid[row-1][col-1];
				N  = tempGrid[row-1][col];
				NE  = tempGrid[row-1][col+1];
				E  = tempGrid[row][col+1];
				SE  = tempGrid[row+1][col+1];
				S  = tempGrid[row+1][col];
				SW  = tempGrid[row+1][col-1];
				W  = tempGrid[row][col-1];
				
				// Tally how many live neighbors the current cell has
				int neighbors = NW + N + NE + E + SE + S + SW + W;
				
				// RULE 1 AND 2 COMBINED INTO ONE IF STATEMENT
				// Rule 1 Any live cell with fewer than two live neighbors dies
				// Rule 2 Any live cell with more than three live neighbors dies
				if ((center == 1) && ((neighbors < 2) || (neighbors > 3))) {
					// update to resultant grid
					resultantGrid[row][col] = 0;
				}
				
				// Rule 3 Any live cell with two or three neighbors lives on 
				//  to the next generation
				if ((center == 1) && ((neighbors == 2) || (neighbors == 3))) {
					// update to resultant grid
					resultantGrid[row][col] = 1;
				}
				
				// Rule 4 Any dead cell with exactly three live neighbors becomes
				//  a live cell
				if ((center == 0) && (neighbors == 3)) {
					// update to resultant grid
					resultantGrid[row][col] = 1;
				}
			}
		}
		
		// Set this.grid to resultantGrid through the method setGrid()
		setGrid(resultantGrid);
	}
	
	public void oscillatePatternInitialGrid() {
		// Create an initial pattern of 3 neighboring live cells placed
		//  horizontally in the middle of the grid.
		
		// Values for row and col are currently set to the center of grid
		int row = (getGrid().length / 2) - 1;
		int col = (getGrid()[(getGrid().length / 2) - 1].length / 2) - 1;
		
		// Set pattern of 3 neighboring live cells placed horizontally
		for (int i = 0; i < 3; i++) {
			getGrid()[row][col - 1 + i] = 1;
		}
	}
	
	public void blockPatternInitialGrid() {
		// Create initial pattern of square of 4 live cells placed in middle
		//  of grid, all other cells are dead
		// This will place the first block in the very center square then one
		//  to the East, one to the South, and one SouthEast
		
		// Values for row and col are currently set to the center of grid
		int row = (getGrid().length / 2) - 1;
		int col = (getGrid()[(getGrid().length / 2) - 1].length / 2) - 1;
		
		this.grid[row][col] = 1;
		this.grid[row][col+1] = 1;
		this.grid[row+1][col] = 1;
		this.grid[row+1][col+1] = 1;
	}
	
	public void randomizeInitialGrid() {
		// Sets EACH cell in the grid to a 0 or 1 by rounding the results of
		//  the Math.random() function
		
		for (int row = 0; row < getGrid().length; row++) {
			for (int col = 0; col < getGrid()[0].length; col++) {
				this.grid[row][col] = (int) Math.round(Math.random());
			}
		}
	}
	
	public void glider() {
		// This method adds a glider pattern to the position specified at
		//  row and col.
		
		// Values for row and col are currently set to the center of grid
		int row = (getGrid().length / 2) - 1;
		int col = (getGrid()[(getGrid().length / 2) - 1].length / 2) - 1;
		
		// Set pattern of 3 neighboring live cells placed horizontally
		for (int i = 0; i < 3; i++) {
			getGrid()[row][col - 1 + i] = 1;
		}
		getGrid()[row-1][col+1] = 1;
		getGrid()[row-2][col] = 1;
		
	}
	
public void testPattern() {
		// This is the starting test pattern from the top of page 3 in the PLTL
		//  Cellular Automata document set to corresponding row and col placement
		//  on the grid
		
		int row = 1;
		int col = 2;
		
		// Set pattern of 3 neighboring live cells placed horizontally
		for (int i = 0; i < 3; i++) {
			getGrid()[row][col - 1 + i] = 1;
		}
		getGrid()[row+2][col+1] = 1;
		getGrid()[row+2][col+2] = 1;
		getGrid()[row+3][col+2] = 1;
		
	}
}
