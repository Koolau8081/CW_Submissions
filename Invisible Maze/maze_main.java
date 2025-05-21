import java.util.Scanner;

/*
 * This is my invisible maze game.
 */
public class maze_Main {

	//opens scanner
	static Scanner myReader = new Scanner(System.in);
		
		static boolean finished = false;

	/*
	 * This is my main method MUHAHAHA
	 */
	public static void main(String[] args) {
	
		//makes gametile
		GameTile[][] table = new GameTile[5][5];
		
		//to make game grid thing
			table[0][0] = new GameTile(false, true, false);
			table[0][1] = new GameTile(false, false, true);
			table[0][2] = new GameTile(false, false, true);
			table[0][3] = new GameTile(false, false, false);
			table[0][4] = new GameTile(false, false, true);
			
			table[1][0] = new GameTile(false, false, false);
			table[1][1] = new GameTile(false, false, false);
			table[1][2] = new GameTile(false, false, true);
			table[1][3] = new GameTile(false, false, false);
			table[1][4] = new GameTile(false, false, true);
			
			table[2][0] = new GameTile(false, false, true);
			table[2][1] = new GameTile(false, false, false);
			table[2][2] = new GameTile(false, false, true);
			table[2][3] = new GameTile(false, false, false);
			table[2][4] = new GameTile(false, false, true);
			
			table[3][0] = new GameTile(false, false, true);
			table[3][1] = new GameTile(false, false, false);
			table[3][2] = new GameTile(false, false, false);
			table[3][3] = new GameTile(false, false, false);
			table[3][4] = new GameTile(false, false, true);
			
			table[4][0] = new GameTile(false, false, true);
			table[4][1] = new GameTile(false, false, true);
			table[4][2] = new GameTile(false, false, true);
			table[4][3] = new GameTile(false, false, true);
			table[4][4] = new GameTile(false, false, true);
			
		
		//makes player object
		Player player = new Player();
				
			//sets initial player position
			player.setcPos(0);
			player.setrPos(0);

			//quality of life
			int cPos = player.getcPos();
			int rPos = player.getrPos();
			
			//displays player on initial position
			table[cPos][rPos].setHasPlayer(true);
			
		
			//to print visual
			for(int r = 0; r < table.length; r++) {
					
				for(int c = 0; c < table[0].length; c++) {
					
					System.out.print(table[r][c]);		
				}	
				
				System.out.println();
			}
		
		
		
		//loops the turn until the player reaches the finish goal.	
		while(!finished) {
			
			//prompt user
			System.out.println("Please use the wasd keys to traverse the game board");
			
			//allows for user input to be inputted.
			String userInput = new String(myReader.next());
			
			//allows for player to traverse
			table[cPos][rPos].setHasPlayer(false);
			
			//to traverse the grid.
				
				//down
				if(userInput.equals("s")) {
						
					player.setcPos(cPos + 1);
					
					cPos = player.getcPos();
					rPos = player.getrPos();
					
					table[cPos][rPos].setIsRevealed(true);	
					
					if(table[cPos][rPos].getIsWall() == false) {
						
						table[cPos][rPos].setHasPlayer(true);
					}
					
					else {
						
						player.setcPos(cPos -1);
						
						cPos = player.getcPos();
						rPos = player.getrPos();
						
						table[cPos][rPos].setHasPlayer(true);
						
						System.out.println("You have hit a wall.");
					}
				}
				
				//up
				if(userInput.equals("w")) {
						
					player.setcPos(cPos - 1);
					
					cPos = player.getcPos();
					rPos = player.getrPos();
						
					table[cPos][rPos].setIsRevealed(true);	
					
					if(table[cPos][rPos].getIsWall() == false) {
						
						table[cPos][rPos].setHasPlayer(true);
					}
					
					else {
						
						player.setcPos(cPos + 1);
						
						cPos = player.getcPos();
						rPos = player.getrPos();
						
						table[cPos][rPos].setHasPlayer(true);
						
						System.out.println("You have hit a wall.");
					}
				}
				
				//left
				if(userInput.equals("a")) {
						
					player.setrPos(rPos - 1);
					
					cPos = player.getcPos();
					rPos = player.getrPos();
						
					table[cPos][rPos].setIsRevealed(true);
					
					if(table[cPos][rPos].getIsWall() == false) {
						
						table[cPos][rPos].setHasPlayer(true);
					}
					
					else {
						
						player.setrPos(rPos + 1);
						
						cPos = player.getcPos();
						rPos = player.getrPos();
						
						table[cPos][rPos].setHasPlayer(true);
						
						System.out.println("You have hit a wall.");
					}
				}
				
				//right
				if(userInput.equals("d")) {
						
					player.setrPos(rPos + 1);
					
					cPos = player.getcPos();
					rPos = player.getrPos();
					
					table[cPos][rPos].setIsRevealed(true);	
					
					if(table[cPos][rPos].getIsWall() == false) {
					
						table[cPos][rPos].setHasPlayer(true);
					}
					
					else {
						
						player.setrPos(rPos - 1);
						
						cPos = player.getcPos();
						rPos = player.getrPos();
						
						table[cPos][rPos].setHasPlayer(true);
						
						System.out.println("You have hit a wall.");
					}
				}
				
			
			//check if completed maze.
			if(cPos == 0 && rPos == 3) {
				
				finished = true;
				
			}
			
			//to print visual
			for(int r = 0; r < table.length; r++) {
				
				for(int c = 0; c < table[0].length; c++) {
						
					System.out.print(table[r][c]);		
				}	
				
				System.out.println();
			}
			
		
		}
		
		//to tell the player they won.
		System.out.println("Yay you made it to the end!");
	}

}
