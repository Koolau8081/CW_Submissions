
import java.util.Scanner;

/*
 * This class is for my TicTacToe game
 */
public class ticTacToe {

	
	//creates 3x3 2d array for TicTacToe.
	static String[][] table = 
			
		{
			{".", ".", "."},
			
			{".", ".", "."}, 
			
			{".", ".", "."}
		};
	
	//to make easier time of coding(quality of life).
	static String a1 = table[0][0];
	static String a2 = table[0][1];
	static String a3 = table[0][2];
	
	static String b1 = table[1][0];
	static String b2 = table[1][1];
	static String b3 = table[1][2];
	
	static String c1 = table[2][0];
	static String c2 = table[2][1];
	static String c3 = table[2][2];
	
	//Opens the scanner
	static Scanner myReader = new Scanner(System.in);
	
	/*
	 * THIS IS MY MAIN METHOD MUHAHA.
	 */
	public static void main(String[] args) {
		
		//start up and tutorial of the game. 
		startUp(table);
		
		//prompt user
			
			
		printVisual(table);
	
		
		//a players turn
		player1Turn(table);
		
		

	}

	
	/*
	 * This method is passed a 2d array and creates a visual grid for the user with that array.
	 */
	public static void printVisual(String[][] grid) {
		String table = 
				
				  "     1   2   3  \n"
				+ "   +---+---+---+\n"
		   + " a " + "| "+a1+" | "+a2+" | "+a3+" |\n"
				+ "   +---+---+---+\n"
	   	   + " b " + "| "+b1+" | "+b3+" | "+b3+" |\n"
				+ "   +---+---+---+\n"
		   + " c " + "| "+c1+" | "+c2+" | "+c3+" |\n"
				+ "   +---+---+---+ ";
		
		
		System.out.println(table);
		
	}
	
	public static void startUp(String[][] grid) {
		
		System.out.println("Hi");
		
	}
	
	
	public static String[][] player1Turn(String[][] grid) {
		
		//allowing p1 to type 
		String userInput = new String(myReader.next());
		
		//To make easier to type
		String uI = userInput;
		
		
		//a
		if(uI == "a1" && a1 == ".") {
			
			a1 = "0";
		}
		
		if(uI == "a2" && a2 == ".") {
			
			a2 = "0";
		}
		
		if(uI == "a3" && a3 == ".") {
			
			a3 = "0";
		}
		
		//b
		if(uI == "b1" && b1 == ".") {
			
			b1 = "0";
		}
		
		if(uI == "b2" && b2 == ".") {
			
			b2 = "0";
		}
		
		if(uI == "b3" && b3 == ".") {
			
			b3 = "0";
		}
		
		//c
		if(uI == "c1" && c1 == ".") {
			
			c1 = "0";
		}
		
		if(uI == "c2" && c2 == ".") {
			
			c2 = "0";
		}
		
		if(uI == "c3" && c3 == ".") {
			
			c3 = "0";
		}
		
		return grid;
		
	}
	
	
	public static boolean checkWin(String [][] grid) {
		
		boolean check = false;
		
		//to teck if middle is involved in win for player 2(X)
		if(b2 == "X") {
			
			
			
		}
		
			
			
		for(int r = 0; r < grid.length; r++) {
			
			for(int c = 0; c < grid.length; c++) {
				
				
				
			}
		}
		
		return check;
	}
	
}
