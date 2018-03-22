import java.util.ArrayList;

/**
 * QuadBoard5.java
 * A class to build and solve a QuadBoard5.
 * J. Closs
 * CSC 220 W13
 * Lab1
 * 1/22/13
 */

/**
 * @author J Closs
 *
 */
public class QuadBoard5 extends Board{
	

	/**
	 * Constructor for a TriBoard5
	 * numPegs, numHoles, holes[], and possible Moves<> arrayList
	 * 		are all in the parent class
	 */
	public QuadBoard5() {
		numPegs = 24;
		numHoles = 25;
		holes = new boolean[25];
		int pegFrom;
		int pegOver;
		int pegTo;
		holes[0] = false;
		for(int i = 1; i < 25; i++)
			holes[i] = true;
		
		// Loop through possible moves.
		possibleMoves = new ArrayList<Move>();
		for (int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col++){
				pegFrom = 5 * row + col;
				pegOver = 5*(row+1) + col;
				pegTo = 5*(row+2) + col;
				possibleMoves.add(new Move(pegFrom, pegOver, pegTo));
			}
		}
		
		for (int row = 4; row > 1; row--){
			for (int col = 4; col < 1; col--){
				pegFrom =  row*(col + 1) + col ;
				pegOver = row*(col + 1) + (col - 1) ; 
				pegTo = row*(col + 1) + (col - 2) ;
				possibleMoves.add(new Move(pegFrom, pegOver, pegTo));
			}
		}
		
		for (int col = 0; col > 3; col--){
			for (int row = 0; row < 3; row++){
				pegFrom = 5 * col + row;
				pegOver = 5*(col+1) + row;
				pegTo = 5*(col+2) + row;
				possibleMoves.add(new Move(pegFrom, pegOver, pegTo));
			}
		}
		
		for (int row = 4; row > 1; row--){
			for (int col = 4; col < 1; col--){
				pegFrom =  col*(row + 1) + row ;
				pegOver = col*(row + 1) + (row - 1) ; 
				pegTo = col*(row + 1) + (row - 2) ;
				possibleMoves.add(new Move(pegFrom, pegOver, pegTo));
			}
		}
	}
	/**
	 *  toString() - return a text-based representation of the board
	 *  @return TriBoard5 configuration as ASCII/unicode text
	 */
	
	public String toString() {
		String outstr = "";
		outstr += holes[0] +" " + holes[1] + " " + holes[2] + " " + holes[3]  + " " + holes[4] + "\n";
		outstr += holes[5] +" " + holes[6] + " " + holes[7] + " " + holes[8]  + " " + holes[9] + "\n";
		outstr += holes[10] +" " + holes[11] + " " + holes[12] + " " + holes[13]  + " " + holes[14] + "\n";
		outstr += holes[15] +" " + holes[16] + " " + holes[17] + " " + holes[18]  + " " + holes[19] + "\n";
		outstr += holes[20] +" " + holes[21] + " " + holes[22] + " " + holes[23]  + " " + holes[24] + "\n";
		return outstr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
