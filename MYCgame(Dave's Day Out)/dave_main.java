

import java.util.Scanner;


/*
 * This is the main class where everything comes together in the Dave parable.
 */
public class dave_Main {

	//declaring variables for use
	static String DEFAULT = "\033[0m";
	static boolean done;
	
	//opens a scanner
	static Scanner myReader = new Scanner(System.in);
	
	

	/*
	* This is my main method for my Dave main. The main's main.
 	*/
	public static void main(String[] args) {
		
		//first dialogue
		startUp();
		
		//creates a dave object
		Dave Dave1 = new Dave();
		System.out.println();
		
		//loops if the user isnt happy with choices they made.
		done = false;
		while(done == false) {
			
			//Dave Name
			Dave1.setDaveName();
			System.out.println();
			System.out.print("Your dave's name will be \"");
			System.out.print(Dave1.getDaveName());
			System.out.println("dave.\"");
			System.out.println();
			
		
			//Dave Type
			Dave1.setDaveType();
			System.out.println();
			System.out.print("You have chosen ");
			System.out.print(Dave1.getDaveType());
			System.out.println(" as your Dave Type.");
			System.out.println();
			System.out.println();
		
			
			//Setting dave looks after davetype for later use.
			Dave1.setDaveLooks();
			
			
			
			//Narrator Text Color
			Dave1.setNarratorTextColor();
			System.out.print("Your Dave's user's input color is now set to ");
			System.out.print(Dave1.getNarratorTextColor());
			System.out.print(Dave1.getNColorName());
			System.out.println(".");
			System.out.println(DEFAULT);
			
			
			//Input Text Color
			System.out.println();
			Dave1.setInputTextColor();
			System.out.print("Your Dave's user's input color is now set to ");
			System.out.print(Dave1.getInputTextColor());
			System.out.print(Dave1.getIColorName());
			System.out.println(".");
			System.out.print(DEFAULT);
			System.out.println();
			System.out.println();
			
			
			//Summary of choices
			System.out.println("Now, here is a summery of your choices:");
			System.out.println();
			Dave1.getPlayerDaveInfo();
			System.out.println();
			System.out.println();
			
			
			//prompts the user if they want to save their choices on their dave.
			finishedWithDaveMaker();
			System.out.println();
			System.out.println();
		
		}
		
			//into the game
			System.out.println("Great! Now the game can begin.");
			System.out.println();
			
			
			//first scene
			System.out.print(Dave1.getNarratorTextColor());
			System.out.print(Dave1.getDaveName());
			System.out.println(" waddles out of his cave and looks in the Mirror.");
			System.out.println();
			System.out.println("As a " + Dave1.getDaveType() + ", he is a duck. Well he would be a duck no matter what dave "
					+ "type he is but heres what he looks like:");
			System.out.println();
			System.out.println(DEFAULT);
			System.out.println(Dave1.getDaveLooks());
			
			
			
			
			//end of DEMO 
			System.out.println("Thank you for playing Dave's Day Out DEMO!! The rest of the"
					+ " game is currently being worked on and probably wont be done for a while");
		

	}
	
	/*
	 * This method is the first thing the user will see when they press the start button.
	 */
	public static void startUp() {
		
		//prompts user
		System.out.println("Hello and welcome to the Dave's Day Out DEMO! Please enter \"start\" to begin your adventure.");
		
		//creates and declares boolean
		boolean answered = false;
	
		//loops if the user does not input start
		while(answered == false) {
			
			//allows for user input
			String userInput = new String(myReader.next());
			
			//if the user inputs start the game is begun
			if(userInput.equals("start")) {
			
				//prints for user telling them their input is understood
				System.out.println("okay!");
				
				//declares as true so the loop stops
				answered = true;
			
			}
			
			
			else {
				
				//prints if the user inputs anything besides "start".
				System.out.println("Answer with \"start\" or you can't begin.");
				
			}
			
		}
		
	
		
	}
	
	
	/*
 	* This method is used to determin if the user is done with costomizing their dave.
 	*/
	public static void finishedWithDaveMaker() {
		
		//creates boolean
		boolean answered = false;
		
		//if user not sure then loops
		while(answered == false) {
			
			//prompts user 
			System.out.println("Are you satisfied with these choices?");
			
			//allows for user input
			String userInput = new String(myReader.next());
			
			//runs if user inputs yes
			if(userInput.equals("yes")){
				
				//declares answered as true
				answered = true;
				
				//declares done as true, stopping the loop.
				done = true;
					
			}
			
			//runs if user input is "no"
			if(userInput.equals("no")) {
				
				//declares answered as true
				answered = true;
				
				//declares done as false, so the loop stops but the player goes through character creation again.
				done = false;
				
				//prompts the user to make their dave again. 
				System.out.println("Okay! Let's start again then so you can change it.");
				
			}
			
		
				
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
