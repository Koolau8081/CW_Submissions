
import java.util.Scanner;

/*
 * This class is for my TicTacToe game
 */
public class ticTacToe {

	//creates 3x3 2d array for TicTacToe.
	static String[][] table = 
			
		{
			{" ", " ", " "},
			
			{" ", " ", " "}, 
			
			{" ", " ", " "}
		};
	
	//to check if it's player1's turn or player 2's.
	static boolean p1Turn = true;
	
	//to check if won.
	static boolean win = false;
	
	//coloring strings for player and coordinates
	static String orig = "\033[0m";//back to normal(original color)
	
	static String p1c = "\033[38;5;183m";//purple
	static String p2c = "\033[38;5;156m";//green
	
	static String COLUMNS = "\033[38;5;117m";//blue
	static String ROWS = "\033[38;5;216m";//orange
	
	//Opens the scanner
	static Scanner myReader = new Scanner(System.in);
	
	
	
	/*
	 * THIS IS MY MAIN METHOD MUHAHA.
	 */
	public static void main(String[] args) {
		
		//start up and tutorial of the game. 
		startUp(table);	
	
		//prints the starting tic tac to map.
		printVisual();
		
		//a players turn
		playerTurn();
		
	}

	
	/*
	 * This method is passed a 2d array and creates a visual grid for the user with that array.
	 */
	public static void printVisual() {
		
		//layout for tic tac to grid
		String table2 = 
				
				COLUMNS +"     1   2   3  \n" + orig
				+ "   +---+---+---+\n"
		   + ROWS + " a " + orig +  "| "+table[0][0]+" | "+table[0][1]+" | "+table[0][2]+" |\n"
				+ "   +---+---+---+\n"
	   	   + ROWS + " b " + orig + "| "+table[1][0]+" | "+table[1][1]+" | "+table[1][2]+" |\n"
				+ "   +---+---+---+\n"
		   + ROWS+ " c " + orig + "| "+table[2][0]+" | "+table[2][1]+" | "+table[2][2]+" |\n"
				+ "   +---+---+---+ ";
		
		
		System.out.println(table2);
		
	}
	
/*
 * Will show the rules and start up of the game. 
 */
	public static void startUp(String[][] grid) {
		
		//prompts the user.
		System.out.println("PLAYER 1 will be "+ p1c + "X " + orig + "'s and PLAYER 2 will be "+ p2c +"O"+ orig +"'s. PLAYER 1 will go first."
		+ "\n\n"
		+ "To take your turn, first type the letter(" + ROWS + "row" + orig + ") of the box you want to take followed by the number(" + COLUMNS + "column" + orig + "). "
		+ "\n");
		
	}
	
/*
 * This method is either players turn. Players turn.	
 */
	public static void playerTurn() {

		//for later to tell computer that the input given is valid or invalid.
		boolean invalid = false;
		
		
		//For easier to write X and O(quality of life)
		String p1 = p1c + "X" + orig;
		String p2 = p2c + "O" + orig;
		
		//to switch between X and O for visuals.
		String mark;
		
		String playerString;
		
		if(p1Turn == true) {
			mark = p1;
			playerString = "PLAYER 1";
		}
		else {
			mark = p2;
			playerString = "PLAYER 2";
		}
		
		
		//allowing p1 to type 
		String userInput = new String(myReader.next());
		
		//To make easier to type
		String uI = userInput;
		
		//takes input from user and inputs into the visual in spot chosen
		
			//a
			if(uI.equals("a1") && table[0][0] == " ") {
				
				table[0][0] = mark;
			}
			
			else if(uI.equals("a2") && table[0][1] == " ") {
				
				table[0][1] = mark;
			}
			
			else if(uI.equals("a3") && table[0][2] == " ") {
				
				table[0][2] = mark;
			}
			
			//b
			else if(uI.equals("b1") && table[1][0] == " ") {
				
				table[1][0] = mark;
			}
			
			else if(uI.equals("b2") && table[1][1] == " ") {
				
				table[1][1] = mark;
			}
			
			else if(uI.equals("b3") && table[1][2] == " ") {
				
				table[1][2] = mark;
			}
			
			//c
			else if(uI.equals("c1") && table[2][0] == " ") {
				
				table[2][0] = mark;
			}
			
			else if(uI.equals("c2") && table[2][1] == " ") {
				
				table[2][1] = mark;
			}
			
			else if(uI.equals("c3") && table[2][2] == " ") {
				
				table[2][2] = mark;
			}
			
			//prompts user to try inputing for same turn again because what they inputed was not a coordinate or was alr occupied.
			else {
				invalid = true;
				System.out.println("\nInvalid input or space already filled. Please try again. Don't forget right formatting ex: \"a1\" \n");
		}
		
		//prints the table for players to see.
		if(invalid == false) {
		printVisual();
		}

		//checks if anyone has won. 
		checkWin(mark);
		if(win == true) {
			
			System.out.println("\n" + playerString + " has won!!!");	
			
		}
		
		
		else {
			
			//To switch from player 1's turn to player 2's. (Switch between X and O).
			if(invalid == false) {
				
				if(p1Turn == true) {
					
					p1Turn = false;
					System.out.println("\nPLAYER 2 turn:");
				}
				
				else {
					
					p1Turn = true;
					System.out.println("\nPLAYER 1 turn:");
				}
			}	
			
			//repeats the method since no one won yet.
			playerTurn();	
			
		}
		
