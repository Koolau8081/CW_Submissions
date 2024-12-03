
import java.util.Scanner;
	
/*
 * This class is my basic Worldle game.
 */
public class wordle_main {
	
	//creates a scanner
	static Scanner myReader = new Scanner(System.in);

	//sets the word for remainder of run
	static String word = wordGenerator();
	
	//sets the starting guess count
	static int guessCount = 5;
	
	//sets variable that determines weather the guess is correct
	static boolean guessedCorrect;
	
/*
 * This is my main method.
 */
	public static void main(String[] args) {
	
		//The first thing that the user will see when they press run.
		System.out.println("You have 5 chances to guess the correct word. Make your first guess:");
		
		//generates the "random" word
		wordGenerator();
		
		//runs wordle mechanics until they guess correctly or they run out of guesses.
		while((guessCounter(5) >= 0) && guessedCorrect == false) {
		System.out.println(wordleMechanics(word));
		}
		
	}

	
	
/*
 * This method generates one of 5 random words.
*/
	public static String wordGenerator() {

		//generates random number
		int random = ((int)(Math.random()*5)+1);
		
		//determines what word is the correct word based off different numbers generated
		if(random == 1) {
		
			String word = "break";
			
			return word;
		}
		
		else if(random == 2) {
			
			String word = "yield";
			
			return word;	
		}
		
		else if(random == 3) {
			
			String word = "trash";
			
			return word;
		}
		
		else if(random == 4) {
			
			String word = "write";
			
			return word;
		}
		
		else {
			
			return "error";
		}

	}
	
	
	
	
/*
 * This method keeps track of the guesses the user has had.
 */
	public static int guessCounter(int x) {
		
		//subtracts 1 guess every time the user guesses.
		guessCount --;
		
		return guessCount;
	}
	
/*
 * This is the basic main game mechanics: determining if the guess is correct or not.
 */
	public static String wordleMechanics(String word) {
		
		guessedCorrect = false;
		
		//for simpler use of the correct word with .charAt()
		char wc1 = word.charAt(0);
		char wc2 = word.charAt(1);
		char wc3 = word.charAt(2);
		char wc4 = word.charAt(3);
		char wc5 = word.charAt(4);

		//allowing the user to input their guess.
		String userInput = new String(myReader.next());
		
		//if the user runs out of guesses without guessing the correct word.
		if((userInput != word) && (guessCount == 0)) {
	
		return("Oops you ran out of guesses better luck next time. By the way, the word you failed to guess was \"" + word + "\".");
	
		}

		//code that determines if the user got the word/letters correct or not.
		if((userInput.length() == 5) && (userInput != word)) {

			//for simpler use of the users input with .charAt()
			char userC1 = userInput.charAt(0);
			char userC2 = userInput.charAt(1);
			char userC3 = userInput.charAt(2);
			char userC4 = userInput.charAt(3);
			char userC5 = userInput.charAt(4);
		
			//what will show for the user, the output after they guess.
			char char1 = 'X';
			char char2 = 'X';
			char char3 = 'X';
			char char4 = 'X';
			char char5 = 'X';
		
			
			//to help determine if the char has been correctly guessed by user
			boolean c1;
			boolean c2;
			boolean c3;
			boolean c4;
			boolean c5;
		
			//if the user gets the word correct
			if(userC1 == wc1 && userC2 == wc2 && userC3 == wc3 && userC4 == wc4 && userC5 == wc5) {
						
				userInput = word;
				
				guessedCorrect = true;
					
				return "Good job! You got it correct.";
			}
	
		
			//If the user gets a letter correct
		
			//if char1 = correct
			if(wc1 == userC1) {
				
				c1 = true;
				
				char1 = wc1;	
			}
			
			else {
			
				c1 = false;
			}
			
			//if char2 = correct
			if(wc2 == userC2) {
				
				c2 = true;
				
				char2 = wc2;	
			}
			
			else {
				
				c2 = false;
		
			}
			
			
			//if char3 = correct
			if(wc3 == userC3) {
				
				c3 = true;
				
				char3 = wc3;	
			}
			
			else {
				
				c3 = false;
			}
		
			//if char4 = correct
			if(wc4 == userC4) {
			
				c4 = true;
				
				char4 = wc4;
			}
			
			else {
				
				c4 = false;
			}
			
			//if char5 = correct
			if(wc5 == userC5) {
				
				c5 = true;
				
				char5 = wc5;	
			}
			
			else {
				
				c5 = false;
			}
			
		
			//if the user gets a letter correct but not in the right spot in the word
			
			if((userC1 != wc1) && (userC1 == wc2 && c2 == false || userC1 == wc3 && c3 == false || userC1 == wc4 && c4 == false || userC1 == wc5 && c5 == false)) {
				
				
				
				char1 = '?';	
			}
			
			
			if((userC2 != wc2) && (userC2 == wc1 && c1 == false || userC2 == wc3 && c3 == false || userC2 == wc4 && c4 == false || userC2 == wc5 && c5 == false)) {
				
				char2 = '?';	
			}
			
			
			if((userC3 != wc3) && (userC3 == wc1 && c1 == false || userC3 == wc2 && c2 == false|| userC3 == wc4 && c4 == false || userC3 == wc5 && c5 == false)) {
				
				char3 = '?';
			}
			
			
			if((userC4 != wc4) && (userC4 == wc1 && c1 == false || userC4 == wc2 && c2 == false|| userC4 == wc3 && c3 == false || userC4 == wc5 && c5 == false)) {
				
				char4 = '?';	
			}
			
			
			if((userC5 != wc5) && (userC5 == wc1 && c1 == false || userC5 == wc2 && c2 == false|| userC5 == wc3 && c3 == false || userC5 == wc4 && c4 == false )) {
				
				char5 = '?';	
			}
			
			
			//to correct the grammar of guesses if there is only one guess left.
			String guessGrammar = "guesses";
			
			if(guessCount == 1) {
			
				guessGrammar = "guess";
			}
		
			
			//returns the string that the user will see if they guess and get it wrong but still has guesses left.
			if(userInput != word && guessCount != 0) {
	
			return ("You have " + guessCount + " " + guessGrammar + " remaining."+ "\n" + char1 + char2 + char3 + char4 + char5);
	
			}
			
		}
	
	
		//gives back a guess if the player inputs a string longer than 5 characters.
		else if(userInput.length() > 5 || userInput.length() < 5 ) {
			
			
			//to correct the grammar of guesses if there is only one guess left.
			String guessGrammar = "guesses";
			
			if(guessCount == 1) {
				
				guessGrammar = "guess";
			}
			
			//adds back players guess
			guessCount ++;
				
			return("Guess may contain no more/less than 5 characters. Try again, " + "you have " + guessCount + " " + guessGrammar + " remaining.");	
	
			
		}
	
		//fail safe just incase there's smth that goes wrong.
		return("error start again");
		
		}
		
	
}
