
import java.util.Scanner;


public class monty_hall {

	public static void main(String[] args) {
		
		
		
		int winDoor = pickRandomDoor();
		System.out.println("Shhhhh...The winning Door is " + winDoor + ".");
		System.out.println();
		
	
		
		int playerDoor = pickPlayerDoor();
	
		
		String revealedDoor = showWrongDoor(winDoor, playerDoor);
		System.out.println(revealedDoor);
		
		int yesOrNo = wannaSwitchOrNah();
		
		String reveal = finReveal(playerDoor, revealedDoor, yesOrNo);
		
	}
	

	public static int pickRandomDoor() {
		
		
		
		return((int)(Math.random()*3)+1);
		
	}

	
	
	
	
	private static int pickPlayerDoor() {
		
		
		//prompt user
		System.out.println("Pick a door: one, two or three");
		
		//make scanner object
		Scanner myReader = new Scanner(System.in);
		String userInput = new String(myReader.next());
		
		
		
		//if pick door 1
		if (userInput.equals("one") || userInput.equals("1")) {
			
			//prompt user
			System.out.println("You picked door number 1");
			
			myReader.close();
			return 1;	
		}
		
		
		//if pick door 2
		else if (userInput.equals("two") || (userInput.equals("2"))) {
			
			//prompt user
			System.out.println("You picked door number 2");
			
			myReader.close();
			return 2;
		}
		
		
		//if pick door 3
		else if (userInput.equals("three") || (userInput.equals("3"))) {
			
			//prompt user
			System.out.println("You picked door number 3");
			
			myReader.close();
			return 3;
		}
		
		
		else {
			
			System.out.println("Try again... you picked doors that dont exist");
			myReader.close();
			return 0;
		}
		

	}
	
	
	
	
	public static String showWrongDoor(int winDoor, int playerDoor) {
		
		
		//if prize door = users choice 
		if (playerDoor == 1 && winDoor == 2) {
			
			
			return ("Door 3 is not the prize door. Would you like to switch your answer?");
			
		}
		
		
		else if (playerDoor == 1 && winDoor == 3) {
		
			
			return ("Door 2 is not the prize door. Would you like to switch your answer?");
			
		}
		
		
		else if (playerDoor == 1 && winDoor == 1) {
	
			int wrongDoor = ((int)(Math.random()*2)+2);
			
	
			return ("Door " + wrongDoor + " is not the prize door. Would you like to switch your answer?");
		}
		
		else if (playerDoor == 2 && winDoor == 1) {
			
	
			return ("Door 3 is not the prize door. Would you like to switch your answer?");
			
			
		}
		
		else if (playerDoor == 2 && winDoor == 3) {
			
			
			return ("Door 1 is not the prize door. Would you like to switch your answer?");
			
			
		}
		
		else if (playerDoor == 3 && winDoor == 3) {
			
			int wrongDoor = ((int)(Math.random()*2)+1);
			
			if(wrongDoor == 2) {
				
				wrongDoor = 3;
				
				return ("Door " + wrongDoor + " is not the prize door. Would you like to switch your answer?");
				
			}
			
			else {
				
				return ("Door " + wrongDoor + " is not the prize door. Would you like to switch your answer?");
			
			}
			
		}
		
		else if (playerDoor == 3 && winDoor == 1) {
		
		
			return ("Door 2 is not the prize door. Would you like to switch your answer?");
		
		
		}
		
		else if (playerDoor == 3 && winDoor == 2) {
		
		
			return ("Door 1 is not the prize door. Would you like to switch your answer?");
			
		
		}
		
		else if (playerDoor == 3 && winDoor == 3) {
		
			int wrongDoor = ((int)(Math.random()*2)+1);
		

			return ("Door " + wrongDoor + " is not the prize door. Would you like to switch your answer?");
		
		}
		
		
		else {
			
			return ("How do you mess up a yes or no question. Try again.");
		}
		
	
	}
	
	
	public static int wannaSwitchOrNah() {
	
		Scanner myReader = new Scanner(System.in);
		String userInput = new String(myReader.next());
	
		if (userInput.equals("yes")) {
			
			myReader.close();
			return 1;
			
		}
		else if (userInput.equals("no")) {
			
			myReader.close();
			return 2;
		}
		else {
			
			myReader.close();
			return 3;
			
		}
	}
	
	public static int finReveal(int playerDoor, String revealedDoor, int yesOrNo) {
			
		if (yesOrNo == 1) {
			
			
			
		}
		
		//return "Door number 1 was " + "Door number 2 was " + "Door number 3 was ";
		return 2;
		
	}
	
	
}
