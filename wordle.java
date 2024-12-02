
import java.util.Scanner;


public class wordle {
	

	static Scanner myReader = new Scanner(System.in);

	static String word = wordGenerator();
	
	static int guessCount = 5;
	
	static boolean guessedCorrect;
	
/*
 * This is my main method.
 */
	public static void main(String[] args) {
	
		
		System.out.println("You have 5 chances to guess the correct word. Make your first guess:");
		
		wordGenerator();
		
		while((guessCounter(5) >= 0) && guessedCorrect == false) {
		System.out.println(wordleMechanics(word));
		}
		
	}

	
	
/*
 * method that generates a random word
*/
	public static String wordGenerator() {

		
		int random = ((int)(Math.random()*5)+1);
		
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
 * keeps track of the guesses the user has had.
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
		
			char char1 = 'X';
			char char2 = 'X';
			char char3 = 'X';
			char char4 = 'X';
			char char5 = 'X';
		
		//if the user gets the word correct
			if(userC1 == wc1 && userC2 == wc2 && userC3 == wc3 && userC4 == wc4 && userC5 == wc5) {
						
				userInput = word;
				
				guessedCorrect = true;
					
				return "Good job! You got it correct.";
			}
			
		//if the user gets a letter correct but not in the right spot in the word
			
			if((userC1 != wc1) && (userC1 == wc2 || userC1 == wc3 || userC1 == wc4 || userC1 == wc5)) {
				
				char1 = '?';	
			}
			
			
			if((userC2 != wc2) && (userC2 == wc1 || userC2 == wc3 || userC2 == wc4 || userC2 == wc5)) {
				
				char2 = '?';	
			}
			
			
			if((userC3 != wc3) && (userC3 == wc1 || userC3 == wc2 || userC3 == wc4 || userC3 == wc5)) {
				
				char3 = '?';
			}
			
			
			if((userC4 != wc4) && (userC4 == wc1 || userC4 == wc2 || userC4 == wc3 || userC4 == wc5)) {
				
				char4 = '?';	
			}
			
			
			if((userC5 != wc5) && (userC5 == wc1 || userC5 == wc2 || userC5 == wc3 || userC5 == wc4)) {
				
				char5 = '?';	
			}
			
			
		//If the user gets a letter correct
			
			//if char1 = correct
				if(wc1 == userC1) {
				
					char1 = wc1;	
				}
				
			//if char2 = correct
				if(wc2 == userC2) {
					
					char2 = wc2;	
				}
				
			//if char3 = correct
				if(wc3 == userC3) {
					
					char3 = wc3;	
				}
			
			//if char4 = correct
				if(wc4 == userC4) {
				
					char4 = wc4;
				}
				
			//if char5 = correct
				if(wc5 == userC5) {
						
					char5 = wc5;	
				}
				
				
			//to correct the grammar of guesses if there is only one guess left.
				String guessGrammar = "guesses";
				if(guessCount == 1) {
					guessGrammar = "guess";
				}
				
			if(userInput != word && guessCount != 0) {
	
				return ("You have " + guessCount + " " + guessGrammar + " remaining."+ "\n" + char1 + char2 + char3 + char4 + char5);
	
			}
			
			else {
				
				guessedCorrect = true;
				
				return("Correct! Good job.");
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
	
	
		return("error start again");
		}
		
	
}
