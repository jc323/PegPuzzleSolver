/**
 * 
 */
import java.util.ArrayList;
/**
 * @author J Closs
 *
 */
public class TriBoard5 extends Board {
	
	/**
	 * Constructor for a TriBoard5
	 * numPegs, numHoles, holes[], and possible Moves<> arrayList
	 * 		are all in the parent class
	 */
	public TriBoard5() {
		numPegs = 14;
		numHoles = 15;
		holes = new boolean[15];
		holes[0] = false;
		for(int i = 1; i < 15; i++)
			holes[i] = true;
		// List of possible moves
		possibleMoves = new ArrayList<Move>();
		possibleMoves.add(new Move(0, 1, 3));
		possibleMoves.add(new Move(0, 2, 5));
		possibleMoves.add(new Move(1, 3, 6));
		possibleMoves.add(new Move(1, 4, 8));
		possibleMoves.add(new Move(2, 4, 7));
		possibleMoves.add(new Move(2, 5, 9));
		possibleMoves.add(new Move(3, 1, 0));
		possibleMoves.add(new Move(3, 4, 5));
		possibleMoves.add(new Move(3, 7, 12));
		possibleMoves.add(new Move(3, 6, 10));
		possibleMoves.add(new Move(4, 8, 13));
		possibleMoves.add(new Move(4, 7, 11));
		possibleMoves.add(new Move(5, 2, 0));
		possibleMoves.add(new Move(5, 4, 3));
		possibleMoves.add(new Move(5, 8, 12));
		possibleMoves.add(new Move(5, 9, 14));
		possibleMoves.add(new Move(6, 3, 1));
		possibleMoves.add(new Move(6, 7, 8));
		possibleMoves.add(new Move(7, 4, 2));
		possibleMoves.add(new Move(7, 8, 9));
		possibleMoves.add(new Move(8, 7, 6));
		possibleMoves.add(new Move(8, 4, 1));
		possibleMoves.add(new Move(9, 5, 2));
		possibleMoves.add(new Move(9, 8, 7));
		possibleMoves.add(new Move(10, 6, 3));
		possibleMoves.add(new Move(10, 11, 12));
		possibleMoves.add(new Move(11, 7, 4));
		possibleMoves.add(new Move(11, 12, 13));
		possibleMoves.add(new Move(12, 8, 5));
		possibleMoves.add(new Move(12, 13, 14));
		possibleMoves.add(new Move(12, 7, 3));
		possibleMoves.add(new Move(13, 8, 4));
		possibleMoves.add(new Move(13, 12, 11));
		possibleMoves.add(new Move(14, 9, 5));
		possibleMoves.add(new Move(14, 13, 12));
		
		
		
	}

	
	/**
	 *  toString() - return a text-based representation of the board
	 *  @return TriBoard5 configuration as ASCII/unicode text
	 */
	
	public String toString() {
		String outstr = "";
		outstr += holes[0] +"\n";
		outstr += holes[1] +" " + holes[2] + "\n";
		outstr += holes[3] +" " + holes[4] + " " + holes[5] + "\n";
		outstr += holes[6] +" " + holes[7] + " " + holes[8] + " " + holes[9] + "\n";
		outstr += holes[10] +" " + holes[11] + " " + holes[12] + " " + holes[13]  + " " + holes[14] + "\n";
		return outstr;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
