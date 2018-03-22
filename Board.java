/**
 *  Board.java
 *  A parent class for recursive peg puzzle solving
 *  J. Closs
 *  CSC 220 W13
 *  Lab 1
 *  1/18/13
 */

import java.util.ArrayList;

/**
 * A simple class to encapsulate a give board.
 * @author J. Closs
 *
 */

class Move{
	int pegFrom;
	int pegOver;
	int pegTo;
	
	public Move(int pf, int po, int pt){
		pegFrom = pf;
		pegOver = po;
		pegTo = pt;
		
		}
	}


public class Board {

	int numPegs;
	int numHoles;
	/**
	 * Occupancy list- holes[i] true if peg in hole i, else false
	 */
	
	boolean []holes;
	
	ArrayList<Move> possibleMoves;
	
	public Board(){
		numPegs = 0;
	}
	/**
	 *  solveBoard() -- Given a board configuration, solve recursively
	 *  	by examining possible moves
	 *  @return true if puzzle solved, else return false
	 */
	boolean solveBoard() {
		
		// if no pegs, null board return false;
			if (numPegs ==0)
				return false;
		// if one peg, print out current-board, return true.
			if (numPegs == 1){
				System.out.println(this);
				return true;
			}
		// if more than one peg, check for legal moves
		
			ArrayList<Move> legalMoves = new ArrayList<Move>();
			for(int i = 0; i < possibleMoves.size(); i++){
				Move m = possibleMoves.get(i);
				if (holes[m.pegFrom] && holes[m.pegOver] && !holes[m.pegTo])
					legalMoves.add(m);
			}
		// if no legal moves, return false
			if(legalMoves.isEmpty()){
				return false;
			}
		// else try moves one at a time, and then call solveBoard(),
		//    if solveBoard() solves, print out current-board/last-move and return true.
		//	  else unmake move
			else {
				System.out.println("There were " + legalMoves.size() + " legal moves!");
				int j;
				for (j = 0; j < legalMoves.size(); j++){
					Move m = legalMoves.get(j);
					holes[m.pegFrom] = holes[m.pegOver] = false;
					holes[m.pegTo] = true;
					numPegs--;
					System.out.println(this);
				
					boolean didSolve = this.solveBoard();
					holes[m.pegFrom] = holes[m.pegOver] = true;
					holes[m.pegTo] = false;
					numPegs++;
					if (didSolve){
						System.out.println(this);
						return true;
					}
				}
				
			}
		// if no move solved, return false.
		
		return false;
	}
	
	public String toString(){
		return "This will return a board";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
