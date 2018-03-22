
/**
 * PuzzleSolver.java
 * A simple class to recursively solve a peg-puzzle game.
 * J. Closs
 * CSC 220 W13
 * Lab1
 * 1/18/13
 */

/**
 * @author J. Closs
 *
 */
public class PuzzleSolver {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create a board of desired type
		Board myBoard = new TriBoard5();
		//Board myBoard = new QuadBoard5();
		
		// Call solveBoard on board to recursively solve
		//	 and print out after each successful move
		
		System.out.println("Starting board looks like:\n" + myBoard);
		boolean solved = myBoard.solveBoard();
		
		// if no solution, print no solution.
		if (!solved)
			System.out.println("Unsolvable!");
		else 
			System.out.println("I'm a genius!");
	}

}
